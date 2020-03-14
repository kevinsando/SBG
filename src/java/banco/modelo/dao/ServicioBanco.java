package banco.modelo.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import banco.modelo.cuenta;
import banco.modelo.moneda;
import banco.datos.BaseDatos;

public class ServicioBanco {

    public Optional<cuenta> obtenerCuenta(String id) {
        Optional<cuenta> r = Optional.empty();
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(CMD_RECUPERAR_CUENTA);) {
            stm.clearParameters();
            stm.setString(1, id);
            try (ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {
                    r = Optional.of(new cuenta(
                            rs.getString("nombre"),
                            rs.getString("id"),
                            rs.getString("password"),
                            rs.getInt("telefono")
                    ));
                }
            }
        } catch (IOException
                | ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
        return r;
    }

    public List<cuenta> obtenerListaCuentas() {
        List<cuenta> r = new ArrayList<>();
        try (Connection cnx = obtenerConexion();
                Statement stm = cnx.createStatement();
                ResultSet rs = stm.executeQuery(CMD_LISTAR_CUENTAS)) {
            while (rs.next()) {
                cuenta c = new cuenta(
                        rs.getString("nombre"),
                        rs.getString("id"),
                        rs.getString("password"),
                        rs.getInt("telefono")
                );
                r.add(c);
            }
        } catch (IOException
                | ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
        return r;
    }

    public Optional<moneda> obtenerMoneda(String nombre) {
        Optional<moneda> r = Optional.empty();
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(CMD_RECUPERAR_MONEDA);) {
            stm.clearParameters();
            stm.setString(1, nombre);
            try (ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {
                    r = Optional.of(new moneda(
                            rs.getString("nombre"),
                            rs.getString("descripcion"),
                            rs.getString("simbolo"),
                            rs.getFloat("compra"),
                            rs.getFloat("venta")
                    ));
                }
            }
        } catch (IOException
                | ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
        return r;
    }

    public List<moneda> obtenerListaMonedas() {
        List<moneda> r = new ArrayList<>();
        try (Connection cnx = obtenerConexion();
                Statement stm = cnx.createStatement();
                ResultSet rs = stm.executeQuery(CMD_LISTAR_MONEDAS)) {
            while (rs.next()) {
                moneda m = new moneda(
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getString("simbolo"),
                        rs.getFloat("compra"),
                        rs.getFloat("venta")
                );
                r.add(m);
            }
        } catch (IOException
                | ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
        return r;
    }

    public Connection obtenerConexion() throws
            ClassNotFoundException,
            IllegalAccessException,
            InstantiationException,
            IOException,
            SQLException {
        BaseDatos bd = BaseDatos.obtenerInstancia();
        Properties cfg = bd.obtenerConfiguracion();
        Connection cnx = bd.obtenerConexion(
                cfg.getProperty("database"),
                cfg.getProperty("user"),
                cfg.getProperty("password")
        );
        return cnx;
    }

    private static final String CMD_RECUPERAR_CUENTA
            = "SELECT nombre,id,password,telefono FROM cuenta WHERE id=?; ";
    private static final String CMD_LISTAR_CUENTAS
            = "SELECT nombre,id,password,telefono FROM cuenta ORDER BY nombre; ";

    private static final String CMD_RECUPERAR_MONEDA
            = "SELECT nombre,id,password,telefono FROM cuenta WHERE id=?; ";
    private static final String CMD_LISTAR_MONEDAS
            = "SELECT nombre,id,password,telefono FROM cuenta ORDER BY nombre; ";
}
