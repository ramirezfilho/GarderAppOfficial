/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GoncalvR
 */
public class PrimeiraLogica implements Logica {
    public String executa(HttpServletRequest req,
              HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica ...");
          
          System.out.println("Retornando o nome da página JSP ...");
return "primeira-logica.jsp";

      }
}
    

