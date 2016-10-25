/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import banco.ConnectionFactory;
import dados.Tarefa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
        


/**
 *
 * @author GoncalvR
 */
public class TarefaDao {
    private Connection connection;

    public TarefaDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
//    private Long id;
//    private Long idCliente;
//    private int unidade;
//    private String descricao;
//    private String enderecoEntrega;
//    private Calendar dataEntrada;
//    private Calendar dataPrevSaida;
//    private Calendar dataSaida;
//    private boolean conclusao;
    
    public void adicionaTarefa(Tarefa tarefaAdicionada) {
        String sql = "insert into tarefas"
                + "(idCliente, tipoUnidade, descricao, endentrega, dataentrada, dataprevsaida, datasaida, conclusao)" + 
                "values(?,?,?,?,?,?,?,?)";

        try {
            // prepared statement para inser��o
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores
            stmt.setLong(1, tarefaAdicionada.getIdCliente());
            stmt.setInt(2, tarefaAdicionada.getUnidade());
            stmt.setString(3, tarefaAdicionada.getDescricao());
            stmt.setString(4, tarefaAdicionada.getEnderecoEntrega());
            stmt.setDate(5, tarefaAdicionada.getDataEntrada());
            stmt.setDate(6, tarefaAdicionada.getDataPrevSaida());
            stmt.setDate(7, tarefaAdicionada.getDataSaida());
            stmt.setBoolean(8, false);
            
//            stmt.setDate(4, new Date(
//                    contato.getDataNascimento().getTimeInMillis()));
            // executa
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Tarefa> listaTarefas() {
        try {
            PreparedStatement stmt = this.connection
                    .prepareStatement("select * from tarefas");
            ResultSet rs = stmt.executeQuery();

            List<Tarefa> tarefas = new ArrayList<Tarefa>();

            while (rs.next()) {

                // criando o objeto Contato
                Tarefa tarefa = new Tarefa();
                tarefa.setId(rs.getLong("id"));
                tarefa.setIdCliente(rs.getLong("idCliente"));
                tarefa.setDataEntrada(rs.getDate("dataentrada"));
                tarefa.setDataPrevSaida(rs.getDate("dataPrevSaida"));
                tarefa.setDataSaida(rs.getDate("dataSaida"));
                tarefa.setDescricao(rs.getString("descricao"));
                tarefa.setEnderecoEntrega(rs.getString("enderecoEntrega"));
                tarefa.setUnidade(rs.getInt("tipoUnidade"));
                tarefa.setConclusao(rs.getBoolean("conclusao"));
                tarefas.add(tarefa);
            }
            rs.close();
            stmt.close();
            return tarefas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void removeTarefas (Long id) {
     try {
         PreparedStatement stmt = connection.prepareStatement("delete " +
                 "from tarefas where id=?");
         stmt.setLong(1, id);
         stmt.execute();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 }
}
