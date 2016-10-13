/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.logica;

import dados.Contato;
import dao.ContatoDao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GoncalvR
 */
public class ListaContatosLogic implements Logica {

    public String executa(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        // Monta a lista de contatos
        List<Contato> contatos = new ContatoDao().getContatos();

        // Guarda a lista no request
        req.setAttribute("contatos", contatos);

        return "/WEB-INF/jsp/listacontatos.jsp";
    }

}
