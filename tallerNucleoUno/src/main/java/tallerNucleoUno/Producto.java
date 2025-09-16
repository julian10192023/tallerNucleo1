package tallerNucleoUno;

import java.util.Objects;

public class Producto {
    String sku;
    String nombre;
    double precio;

    public Producto(String sku, String nombre, double precio) {
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Producto that = (Producto) obj;
        return Objects.equals(sku, that.sku);
    }

    public double getPrecio() {
        return precio;
    }
    public String getSku() {
        return sku;
    }
}
