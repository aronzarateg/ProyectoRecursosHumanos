<%-- 
    Document   : ModificarPerfil
    Created on : 08/11/2014, 09:10:31 PM
    Author     : george
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.rrhh.modelo.PerfilModelo" %>
<jsp:useBean id="list2" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="../../WEB-INF/jspf/jcssspratodos.jspf" %>
        <title>JSP Page</title>
        <style type="text/css">
            *{
                margin: 0 auto;
            }
            #caja{
                width: 300px;
            }
        </style>
    </head>
    <body>
        <%@include file="../../WEB-INF/jspf/cssTopManten.jspf" %>
        <div id="caja">
            <strong>MODIFICAR PERFIL</strong>
            <hr>
            <% for(int i=0; i<list2.size();i++){
                   PerfilModelo user = new PerfilModelo();
                    user = (PerfilModelo)list2.get(i);
            %>
            <form role="form" method="get" action="perfil" >
                
                <div class="form-group">
                    <label for="exampleInputEmail1">Perfil:</label>
                    <input type="text" class="form-control" value="<%= user.getNom_Perfil()%>" name="perfil">
                    <input type="text" class="form-control" value="<%= user.getEstado_Perfil()%>" name="estado">
                    <input type="hidden" name="id" value="<%= user.getIdPerfil()%>">
                    <input type="hidden" name="op" value="4">
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" value="Modificar">
                </div>
            </form>
            <%}%>
        </div>
            <%@include file="../../WEB-INF/jspf/cssBotomMant.jspf" %>
    </body>
</html>
