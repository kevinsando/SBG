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
        <link href="hojaestilos.css" rel="stylesheet" type="text/css"/>
        <title>Banco</title>
    </head>

    <body id ="logg">
        <div id="titulo">
            <h1>Banco</h1>
            <form id="login" action="ServicioMoneda" method="GET">
        </div>
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
                                <input type="text" id="cédula" name="cédula" size="20"
                                       pattern="[1-9]-[0-9]{4}-[0-9]{4}"

                                       title="Número de cédula: X-XXXX-XXXX"
                                       autofocus="autofocus" />
                            </p>
                            <p>
                                <input type="password"name="password"/>
                            </p>
                        </th>

                    </tr>
                <td>
                    <p id="boton">
                        <button type="submit"><a href="cliente.jsp">Enviar</a></button>
                        
                    </p>
                </td>
                </tbody>


            </form>
        </table>
    </body>

</html>
