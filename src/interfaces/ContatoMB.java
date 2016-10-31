/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import dados.Contato;
import dao.ContatoDao;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author GoncalvR
 */
@ManagedBean
@ViewScoped
public class ContatoMB implements Serializable {

    private Contato contato;
    private DataModel contatoList;
    private List<Contato> filteredContatos;
    private Contato contatoSelecionado;

    public DataModel getContatoList() {
        List<Contato> lista = new ContatoDao().listaContatos();
        contatoList = new ListDataModel(lista);
        return contatoList;
    }

    public void setContatoList(List contatoList) {
        this.contatoList = (DataModel) contatoList;
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

    public void editaContato(Contato contato) {
        ContatoDao dao = new ContatoDao();
        dao.alteraContato(contato);
    }

    public void prepararAlterarContato(ActionEvent actionEvent) {
        contato = (Contato) (contatoList.getRowData());
    }

    public String excluirContato(ActionEvent actionEvent) {
        Contato contatoTemp = (Contato) (contatoList.getRowData());
        System.out.println(contatoTemp.getNome());
        ContatoDao dao = new ContatoDao();
        dao.removeContato(contatoTemp.getId());

        addMessage("Mensagem", "Contato excluído com sucesso!");

        return ("gerenciaContato");

    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public List<Contato> getFilteredContatos() {
        return filteredContatos;
    }

    public void setFilteredContatos(List<Contato> filteredContatos) {
        this.filteredContatos = filteredContatos;
    }

    public Contato getContatoSelecionado() {
        return contatoSelecionado;
    }

    public void setContatoSelecionado(Contato selectedCar) {
        this.contatoSelecionado = selectedCar;
    }

    public String getNameLowerCase() {
        if (contato.getNome() == null) {
            return null;
        }
        return contato.getNome().toLowerCase();
    }

}
