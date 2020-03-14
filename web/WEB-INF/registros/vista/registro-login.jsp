<%-- 
    Document   : registro-login
    Created on : 14/03/2020, 03:14:08 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="banco.modelo.usuario" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Registro de estudiantes</title>
        <link href="./css/default.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="wrapper">

            <div id="contents">
                <div class="info">
                    <%
                        usuario u= (usuario) request.getAttribute("registroLogin");
                        if (u != null) {
                    %>
                    <a href="cliente.jsp">Enviar</a>
                    <%
                    } else {
                        String id = request.getParameter("id");
                        if ((id != null) && !id.isEmpty()) {
                    %>

                    <p class="mensajeError">
                        No se encuentra el registro para la identificación
                       
                    </p>

                    <%
                    } else {
                    %>

                    <p class="mensajeError">
                        Identificación o contraseña incorrecta, vuelva a intentar.
                    </p>

                    <%
                           
                        }
                        }
                    %>   
                </div>
            </div>
            <footer></footer>
        </div>
    </body>
</html>
