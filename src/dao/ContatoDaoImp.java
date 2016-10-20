/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Contato;
import util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author GoncalvR
 */
public class ContatoDaoImp implements Contato2Dao {

    public void save(Contato contato) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(contato);
        t.commit();
    }
    public Contato getContato(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Contato) session.load(Contato.class, id);
    }
    public List<Contato> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Contato").list();
        t.commit();
        return lista;
    }
    public void remove(Contato contato) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(contato);
        t.commit();
    }
    public void update(Contato contato) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(contato);
        t.commit();
    }
}
