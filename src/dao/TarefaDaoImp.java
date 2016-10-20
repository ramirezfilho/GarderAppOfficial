/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Model.Tarefa;
import util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author José Alexandre
 */
public class TarefaDaoImp implements TarefaDao {

    public void save(Tarefa livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(livro);
        t.commit();
    }
    public Tarefa getLivro(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Tarefa) session.load(Tarefa.class, id);
    }
    public List<Tarefa> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Livro").list();
        t.commit();
        return lista;
    }
    public void remove(Tarefa livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(livro);
        t.commit();
    }
    public void update(Tarefa livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(livro);
        t.commit();
    }
}
