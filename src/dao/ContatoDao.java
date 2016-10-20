package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import banco.ConnectionFactory;
import dados.Contato;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ContatoDao {

    //Modelo para inser��o de dados para cada classe.
    private Connection connection;

    public ContatoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adicionaContato(Contato contatoAdicionado) {
        String sql = "insert into contatos"
                + "(nome, email, endereco, telefone)" + "values(?,?,?,?)";

        try {
            // prepared statement para inser��o
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, contatoAdicionado.getNome());
            stmt.setString(2, contatoAdicionado.getEmail());
            stmt.setString(3, contatoAdicionado.getEndereco());
            stmt.setString(4, contatoAdicionado.getTelefone());

//            stmt.setDate(4, new Date(
//                    contato.getDataNascimento().getTimeInMillis()));
            // executa
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Contato> listaContatos() {
        try {
            PreparedStatement stmt = this.connection
                    .prepareStatement("select * from contatos");
            ResultSet rs = stmt.executeQuery();

            List<Contato> contatos = new ArrayList<Contato>();

            while (rs.next()) {

                // criando o objeto Contato
                Contato contato = new Contato();
                contato.setId(rs.getLong("id"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setEndereco(rs.getString("endereco"));
                contato.setTelefone(rs.getString("telefone"));
                contatos.add(contato);
            }
            rs.close();
            stmt.close();
            return contatos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void removeContato(Long cod) {
     try {
         PreparedStatement stmt = connection.prepareStatement("delete " +
                 "from contatos where id=?");
         stmt.setLong(1, cod);
         stmt.execute();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 }
    

}
