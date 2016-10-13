<%-- 
    Document   : listacontatos
    Created on : Oct 11, 2016, 10:36:59 AM
    Author     : GoncalvR
--%>
<%@page import="dao.ContatoDao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Home</title>

<meta name="description" content="Source code generated using layoutit.com">
<meta name="author" content="LayoutIt!">

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="cabecalho.jsp" />
        <jsp:useBean id="dao" class="dao.ContatoDao"/>
        <table class="table table-responsive">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Endereço</th>
                    <th>Telefone</th>
                    <th><span class="glyphicon glyphicon-pencil"></span></th>
                    <th><span class="glyphicon glyphicon-remove"></span></th>
                </tr>
            </thead>
            <tbody>
                <!-- percorre contatos montando as linhas da tabela -->
                <c:forEach var="contato" items="${dao.contatos}">
                    <tr>
                        <td>${contato.id}</td>
                        <td>${contato.nome}</td>
                        <td><c:choose>
                                <c:when test="${not empty contato.email}">
                                    <a href="mailto:${contato.email}">${contato.email}</a>
                                </c:when>
                                <c:otherwise>
                                    E-mail não informado
                                </c:otherwise>
                            </c:choose></td>
                        <td>${contato.endereco}</td>
                        <td>${contato.telefone}</td>
                        <td><span class="glyphicon glyphicon-pencil"></span></td>
                        <td><span class="glyphicon glyphicon-remove"></span></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div class="btn-group" role="group" aria-label="...">
            <button type="button" class="btn btn-default" ><a href="index.html">Voltar</a></button>
            <button type="button" class="btn btn-default">Nada</button>
            <button type="button" class="btn btn-default">Nada</button>
        </div>

    </body>
</html>
