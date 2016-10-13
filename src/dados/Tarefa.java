/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;


import java.util.Calendar;

/**
 *
 * @author GoncalvR
 */

@Entity
public class Tarefa {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private Long idCliente;
    private int unidade;
    private String descricao;
    private String enderecoEntrega;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataEntrada;
    @Temporal(TemporalType.DATE)
    private Calendar dataPrevSaida;
    @Temporal(TemporalType.DATE)
    private Calendar dataSaida;  
    
    private boolean conclusao;

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
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
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

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Calendar getDataPrevSaida() {
        return dataPrevSaida;
    }

    public void setDataPrevSaida(Calendar dataPrevSaida) {
        this.dataPrevSaida = dataPrevSaida;
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }
}
