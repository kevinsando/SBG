<%-- 
    Document   : login
    Created on : 03/03/2020, 08:24:48 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <link href="default.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <%
        int id = 0;
        String password = "";
        try {
            id = Integer.parseInt(request.getParameter("id"));
            password = request.getParameter("password");

        } catch (NumberFormatException ex) {
        }
    %>
    <body>
        <h1 id="tit">Banco El Crew</h1>
        <table class="logins">
            <form method="GET" action="#">
                <thead></thead>
                <tbody >
                    <tr>
                        <th id="titulos">
                            <p>Identificación: </p>
                            <p>Contraseña: </p>
                        </th>
                        <th id="campos">
                            <p>
                                <input type="number"value=<%out.println(id);%>name="id"/>
                            </p>
                            <p>
                                <input type="password"name="<%out.println(password);%>password"/>
                            </p>
                        </th>

                    </tr>
                <td>
                    <p id="boton">
                        <button type="submit">Enviar</button>
                    </p>
                </td>
                </tbody>


            </form>
        </table>
    </body>

</html>
