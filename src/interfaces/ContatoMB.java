/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dados.Contato;
import dao.ContatoDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author GoncalvR
 */
@ManagedBean
@ViewScoped
public class ContatoMB implements Serializable {
    private Contato contato = new Contato();
    private List<Contato> contatoList;

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    
    public void adicionaContato() {
        ContatoDao dao = new ContatoDao();
        dao.adicionaContato(contato);
    }
    
    public List getlistaContatos() {
        return contatoList = new ContatoDao().listaContatos();
    }
    
    public void editaContato(Contato contato) {
        ContatoDao dao = new ContatoDao();
        dao.alteraContato(contato);
    }
    
    
    
}
