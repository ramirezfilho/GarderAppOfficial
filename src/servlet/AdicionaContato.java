package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.Contato;
import dao.ContatoDao;
import javax.servlet.RequestDispatcher;

public class AdicionaContato extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException {

        PrintWriter out = response.getWriter();

        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");

//        Calendar dataNascimento = null;
//        
//
//        try {
//            Date date = new SimpleDateFormat("dd/MM/yyyy").
//                    parse(dataEmTexto);
//            dataNascimento = Calendar.getInstance();
//            dataNascimento.setTime(date);
//            
//        } catch (ParseException e) {
//            System.out.println("Erro na conversão da data.");
//            return;
//        }
        Contato contatoAdicionado = new Contato();
        contatoAdicionado.setNome(nome);
        contatoAdicionado.setEndereco(endereco);
        contatoAdicionado.setEmail(email);
        contatoAdicionado.setTelefone(telefone);

        ContatoDao ops = new ContatoDao();
        ops.adiciona(contatoAdicionado);
        RequestDispatcher rd = request
                .getRequestDispatcher("/contato-adicionado.jsp");
        rd.forward(request, response);

    }
}
