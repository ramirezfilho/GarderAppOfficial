/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import banco.ConnectionFactory;
import dados.Tarefa;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author GoncalvR
 */
public class TarefaDao {
    
    private Connection conection;
    
    public TarefaDao() {
        this.conection = new ConnectionFactory().getConnection();
    }
    
    public void addTask(Tarefa addedTask) {
        
        String sql = "insert into tarefa"
                + "(idCliente, unidade, descricao, "
                + "endEntrega, dataEntrada, dataPrevSaida, dataSaida)"
                + " values(?,?,?,?,?,?,?)";
        
        try {
            //Prepara o statement para inserir
            PreparedStatement stm = conection.prepareStatement(sql);
            //Insere os valores 
            
            stm.setLong(1, addedTask.getIdCliente());
            stm.setLong(2, addedTask.getUnidade());
            stm.setString(3, addedTask.getDescricao());
            stm.setString(4, addedTask.getEnderecoEntrega());
            stm.setDate(5, addedTask.getDataEntrada());
            stm.setDate(6, addedTask.getDataPrevSaida());
            stm.setDate(7, addedTask.getDataSaida());
            
            stm.execute();
            stm.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
}