/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.Date;



/**
 *
 * @author GoncalvR
 */
public class Tarefa {
    
    private Long id;
    private Long idCliente;
    private boolean conclusao;
    private int tipoUnidade;
    private String descricao;
    private String enderecoEntrega;
    private Date dataEntrada;
    private Date dataPrevSaida;
    private Date dataSaida;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public int getUnidade() {
        return tipoUnidade;
    }

    public void setUnidade(int unidade) {
        this.tipoUnidade = unidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataPrevSaida() {
        return dataPrevSaida;
    }

    public void setDataPrevSaida(Date dataPrevSaida) {
        this.dataPrevSaida = dataPrevSaida;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }
    
    public boolean getConclusao()  {
        return conclusao;
    }
    
    public void setConclusao (boolean conclusao) {
        this.conclusao = conclusao;
    }
    
    
}
