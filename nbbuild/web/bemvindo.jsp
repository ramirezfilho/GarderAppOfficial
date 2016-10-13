<%-- 
    Document   : bemvindo
    Created on : Oct 11, 2016, 9:56:37 AM
    Author     : GoncalvR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <body>
    <%-- comentário em JSP aqui: nossa primeira página JSP --%>
    
    <%
      String mensagem = "Bem vindo ao sistema de agenda do FJ-21!";
    %>
    <% out.println(mensagem); %>

    <br />
    
    <%
      String desenvolvido = "Desenvolvido por (Ramirez Gonçalves Filho)";
    %>        
    <%= desenvolvido %>

    <br />
    
    <%
      System.out.println("Tudo foi executado!");
    %>
  </body>
</html>
