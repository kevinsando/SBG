package banco.modelo;

import java.io.Serializable;

/**
 *
 * @author Kevin
 */
public class moneda implements Serializable {

    private final String nombre;
    private final String descripcion;
    private final String simbolo;
    private final float compra;
    private final float venta;

    public moneda(String nombre, String descripcion, String simbolo, float compra, float venta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.simbolo = simbolo;
        this.compra = compra;
        this.venta = venta;
    }

    @Override
    public String toString() {
        return String.format("{%s, %s, %s, %s}",
                this.getNombre(), this.getDesc(), this.getSimbolo(), this.getCompra(), this.getVenta());
    }

    String getNombre() {
        return nombre;
    }

    String getDesc() {
        return descripcion;
    }

    String getSimbolo() {
        return simbolo;
    }

    float getCompra() {
        return compra;
    }

    float getVenta() {
        return venta;
    }

}
