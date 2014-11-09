<%-- 
    Document   : ModificarProvincia
    Created on : 09-nov-2014, 17:53:12
    Author     : Dka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.rrhh.modelo.ProvinciaModelo" %>
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
            <strong>MODIFICAR PROVINCIA</strong>
            <hr>
            <% for(int i=0; i<list2.size();i++){
                   ProvinciaModelo user = new ProvinciaModelo();
                    user = (ProvinciaModelo)list2.get(i);
            %>
            <form role="form" method="get" action="Prov" >
                <div class="form-group">
                    <label for="exampleInputEmail1">Region:</label>
                    <input type="text" class="form-control" value="<%= user.getIdregion()%>" name="region">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Provincia:</label>
                    <input type="text" class="form-control" value="<%= user.getNombreprovincia()%>" name="provincia">
                    <input type="hidden" name="id" value="<%= user.getIdprovincia()%>">
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
