<%-- 
    Document   : cliente
    Created on : Mar 11, 2020, 2:23:23 PM
    Author     : MIGUEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <link href="hojaestilos.css" rel="stylesheet" type="text/css"/>
        <title>Cliente</title>
    </head>
    <body id="client">
        <div id="cuerpo">
            <h1>Cliente</h1>
            <section id="cuentas">
                <form method="GET" action="listar-cuentas" class="info">
                    <p style="text-align: center;">
                        <button type="submit">Mostrar cuentas</button>
                    </p>
                </form>
                <table id="TablaC">
                    <thead>
                        <tr>
                            <th>Numero de cuenta</th>
                            <th>Saldo</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>     </td>
                            <td>     </td>
                        </tr>
                    </tbody>
                </table>
            </section>
            <section id="vinculacion">
                <form method="GET" action="vincular-cuentas" class="info">
                    <p>
                        <label>Numero de cuenta a vincular:&nbsp;</label>
                        <input type="text" name="vinc" autofocus="autofocus"
                               placeholder="(digite el numero de cuenta)"/>
                    </p>
                    <p style="text-align: right;">
                        <button type="submit">Consultar</button>
                    </p>
                    <!-- Aqui va la parte que muestra el nombre del dueño de la cuenta especificada si existe-->
                    <p style="text-align: center;">
                        <button type="submit">Vincular</button>
                    </p>
                    <p style="text-align: right;">
                        <button type="submit">Cancelar</button>
                    </p>
                </form>
            </section>
            <section id="transferencia">
                <table class="tablaT">
                    <tbody>
                        <tr>
                            <td class="etiqueta">
                                <label for="monto"><strong>Monto:</strong></label>
                            </td>
                            <td class="campo">
                                <input type="text" id="monto" name="monto" size="15" />
                            </td>
                        </tr>
                        <tr>
                            <td class="etiqueta">
                                <label for="cuentaO"><strong>Cuenta origen:</strong></label>
                            </td>
                            <td class="campo">
                                <input type="text" id="cuentaO" name="cuentaO" size="20" />
                            </td>
                        </tr>
                        <tr>
                            <td class="etiqueta">
                                <label for="cuentaD">Cuenta destino:</label>
                            </td>
                            <td class="campo">
                                <select id="cuentaD" name="cuentaD" size="1">
                                    <option value="1">1111111111</option>
                                    <option value="2">2222222222</option>
                                    <option value="3">33333333</option>
                                    <option value="4">44444444</option>
                                    <option value="5">55555</option>
                                    <option value="6">6666666</option>
                                    <option value="7">77777777</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td class="etiqueta">
                                <label for="detalle">Detalle:</label>
                            </td>
                            <td class="campo">
                                <textarea id="detalle" name="detalle"
                                          cols="40" rows="8"></textarea>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </section>
        </div>
        <footer></footer>
    </body>
</html>
