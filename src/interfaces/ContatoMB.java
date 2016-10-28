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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.application.PrimeResource;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author GoncalvR
 */
@ManagedBean(name = "dtEditView")
@ViewScoped
public class ContatoMB implements Serializable {
  
    private List<Contato> contatoList;
    private Contato selectedContato;
    
    private String newNome;
    private String newEndereco;
    private String newEmail;
    private String newTelefone;
    
    @ManagedProperty("#{contatoService}")
    private Contato contato;

    public String getNewNome() {
        return newNome;
    }

    public void setNewNome(String newNome) {
        this.newNome = newNome;
    }

    public String getNewEndereco() {
        return newEndereco;
    }

    public void setNewEndereco(String newEndereco) {
        this.newEndereco = newEndereco;
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getNewTelefone() {
        return newTelefone;
    }

    public void setNewTelefone(String newTelefone) {
        this.newTelefone = newTelefone;
    }
        
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
    
    public Contato getSelectedContato() {
        return selectedContato;
    }
 
    public void setSelectedContato(Contato selectedContato) {
        this.selectedContato = selectedContato;
    }
        
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Contato editado", ((Contato) event.getObject()).getNome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
//        
//        Long newId = ((Contato) event.getObject()).getId();
//                
//        Contato novo = new Contato();
//               
//        novo.setNome(newNome);
//        novo.setEmail(newEmail);
//        novo.setEndereco(newEndereco);
//        novo.setTelefone(newTelefone);
//        novo.setId(newId);
//        
//        System.out.println(novo.getId());
//        System.out.println(novo.getNome());
//        System.out.println(novo.getEmail());
//        System.out.println(novo.getEndereco());
//        System.out.println(novo.getTelefone());


//        
// 
        
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edição cancelada", ((Contato) event.getObject()).getNome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }    
}
