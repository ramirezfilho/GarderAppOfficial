/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.logica;

import dados.Contato;
import dao.ContatoDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GoncalvR
 */
public class RemoveContatoLogic implements Logica {

    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
 
        
        long id = Long.parseLong(req.getParameter("id"));
        Contato contato = new Contato();
        contato.setId(id);
        ContatoDao dao = new ContatoDao();
        dao.remove(contato.getId());
        System.out.println("Excluindo contato... ");
        return "mvc?logica=ListaContatosLogic";
    }

}
