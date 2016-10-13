package mvc.logica;

import dados.Contato;
import dao.ContatoDao;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GoncalvR
 */
public class AdicionaContatoLogic implements Logica {

    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        Contato contato = new Contato();

        contato.setNome(req.getParameter("nome"));
        contato.setEndereco(req.getParameter("endereco"));
        contato.setEmail(req.getParameter("email"));
        contato.setTelefone(req.getParameter("telefone"));

        ContatoDao dao = new ContatoDao();
        dao.adiciona(contato);

        return "index.jsp";

    }

}
