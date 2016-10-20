/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.Contato2Dao;
import dao.ContatoDaoImp;
import java.util.List;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import model.Contato;

/**
 *
 * @author GoncalvR
 */

@ManagedBean
@SessionScoped
public class ContatoController {
    
    private Contato contato;
    private DataModel listaContatos;

    public DataModel getListarContatos() {
        List<Contato> lista = new ContatoDaoImp().list();
        listaContatos = new ListDataModel(lista);
        return listaContatos;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void prepararAdicionarContato(ActionEvent actionEvent){
        contato = new Contato();
    }

    public void prepararAlterarContato(ActionEvent actionEvent){
        contato = (Contato)(listaContatos.getRowData());

    }

    public String excluirContato(){

        Contato contatoTemp = (Contato)(listaContatos.getRowData());
        Contato2Dao dao = new ContatoDaoImp();
        dao.remove(contatoTemp);
        return "index";

    }

    public void adicionarContato(ActionEvent actionEvent){

        Contato2Dao dao = new ContatoDaoImp();
        dao.save(contato);
        
    }

    public void alterarContato(ActionEvent actionEvent){


        Contato2Dao dao = new ContatoDaoImp();
        dao.update(contato);

    }
}
