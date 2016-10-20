package teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;

import banco.ConnectionFactory;
import dados.Contato;
import dao.ContatoDao;
import java.util.List;

public class TestaConexao {

    public static void main(String[] args) {

//		try {
//			Connection connection = new ConnectionFactory().getConnection();
//			System.out.println("Conexao boa");
//			connection.close();
//		} catch (SQLException e) {
//			System.out.println("Conex�o deu ruims!");
//			
//		}
//		
//		try {
//			banco.ConnectionFactory.insereDados();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		// pronto para gravar
//		 Contato contato = new Contato();
//		 contato.setNome("Ramirez");
//		 contato.setEmail("contato@caelum.com.br");
//		 contato.setEndereco("R. Vergueiro 3185 cj57");
//		 contato.setTelefone("33333333");
//		 
//		 // grave nessa conex�o!!!
//		 ContatoDao dao = new ContatoDao();
//		 
//		 // m�todo elegante
//		 dao.adiciona(contato);
//		 
//		 System.out.println("Gravado!");
        ContatoDao dao = new ContatoDao();
        List<Contato> contatos = dao.listaContatos();

        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Endereço: " + contato.getEndereco());
            System.out.println("Data de Nascimento: "
                    + contato.getTelefone() + "\n");
        }

    }

}
