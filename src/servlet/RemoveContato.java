/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dados.Contato;
import dao.ContatoDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GoncalvR
 */
public class RemoveContato extends HttpServlet {

    @Override

    protected void service(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException {

        PrintWriter out = response.getWriter();

          
        int id = Integer.parseInt((request.getParameter("id")));
        ContatoDao ops = new ContatoDao();
        ops.remove(id);
        
//        out.println("<html> ");
//        out.println("<body>");
//        out.println("Contato removido com sucesso");
//        out.println("</body>");
//        out.println("</html>");

        response.sendRedirect("index.html");
    }

}


