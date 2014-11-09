<%-- 
    Document   : IngresarPerfil
    Created on : 08/11/2014, 09:09:38 PM
    Author     : george
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
            <strong>REGISTRAR PERFIL</strong>
            <hr>
            
            <form role="form" method="get" action="perfil">   
                <div class="form-group">
                    <label for="exampleInputEmail1">Nombre Perfil:</label>
                    <input type="text" class="form-control" name="perfil" placeholder="Ingresar Perfil...">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Estado Perfil:</label>
                    <input type="text" class="form-control" name="estado" placeholder="Ingresar estado...">
                    <input type="hidden" class="form-control" name="op" value="5">
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" value="Resgistrar">
                </div>
            </form>
        </div>
        <%@include file="../../WEB-INF/jspf/cssBotomMant.jspf" %>
    </body>
</html>
