<%-- 
    Document   : ListarPerfil
    Created on : 08/11/2014, 09:09:58 PM
    Author     : george
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.rrhh.modelo.PerfilModelo" %>
<jsp:useBean id="list1" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../../WEB-INF/jspf/jcssspratodos.jspf" %>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../../WEB-INF/jspf/cssTopManten.jspf" %>
        <div class="table-responsive">
            <a href="<%= request.getContextPath()%>/perfil?op=2" class="btn btn-mini btn-primary" role="button">Nuevo</a>
            <hr>
            <table class="table table-bordered" style="width: 800px;">
                <tr>
                    <th>Id</th>
                    <th>Perfil</th>
                    <th>Estado</th>
                    <th></th>
                </tr>
                <% for(int i=0; i<list1.size();i++){
                   PerfilModelo usuario = new PerfilModelo();
                    usuario = (PerfilModelo)list1.get(i);
                    %>
                <tr>
                    <td><%= usuario.getIdPerfil()%></td>
                    <td><%= usuario.getNom_Perfil()%></td>
                    <td><%= usuario.getEstado_Perfil()%></td>
                    <td>
                        <a href="perfil?op=3&id=<%= usuario.getIdPerfil()%>" class="btn btn-mini btn-primary" role="button">Editar</a>
                        <a href="perfil?op=6&id=<%= usuario.getIdPerfil()%>" class="btn btn-mini btn-primary" role="button">Eliminar</a>
                    </td>
                </tr>
                <%}%>
            </table>
        </div>
                <%@include file="../../WEB-INF/jspf/cssBotomMant.jspf" %>
    </body>
</html>
