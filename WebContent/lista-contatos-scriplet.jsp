<%-- 
    Document   : lista-contatos-scriplet
    Created on : Sep 23, 2016, 1:18:13 PM
    Author     : GoncalvR
--%>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@page import="dados.Contato"%>
<%@page import="dao.ContatoDao"%>
<%@page import="com.sun.tools.ws.wsdl.document.Import"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import ="java.util.*"%>
<html>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4">
                </div>

                <div class="col-md-4">
                    <h4>Contact list</h4>
                    <div class="table-responsive">
                        <table class="table table-striped">
                            <thead>
                            <th>ID</th>
                            <th>Nome</th>
                            <th>E-mail</th>
                            <!--<th>Endereço</th>-->
                            <th>Telefone</th>
                            </thead>
                            <%
                                ContatoDao dao = new ContatoDao();
                                List<Contato> contatos = dao.getContatos();

                                for (Contato contato : contatos) {
                            %>

                            <tbody>
                                <tr>
                                    <td><%=contato.getId()%> </td>
                                    <td><%=contato.getNome()%></td> 
                                    <!--<td><%=contato.getEmail()%></td> -->
                                    <td><%=contato.getEndereco()%></td>
                                    <td><%=contato.getTelefone()%></td>
                                </tr>
                            </tbody>
                            <%
                                }
                            %>
                        </table>
                    </div>
                        
                </div>
                        <a href="index.html"> <button class="bt btn-primary" type="button" value="Voltar">Voltar</button></a>
                <div class="col-md-4">
                </div>
            </div>
        </div>

    </body>
</html>
