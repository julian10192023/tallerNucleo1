package tallerNucleoUno;

import java.util.HashMap;
import java.util.Map;

public class Orden {
    private int id;
    private Map<Producto, Integer> productos; /* utilizamos esta estructura ya que permite que los elementos esten duplicados,
    ademas el orden de los productos no es relevante en esta ocacion */
    
    public Orden(int id) {
        this.id = id;
        this.productos = new HashMap<>();
    }
    
    public void agregarProducto(Producto producto, int cantidad) {
        productos.put(producto, productos.getOrDefault(producto, 0) + cantidad);
    }
    
    public void agregarProducto(Producto producto) {
        agregarProducto(producto, 1);
    }
    
    public double calcularTotal() {
        return productos.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPrecio() * entry.getValue())
                .sum();
    }
    
    public Map<Producto, Integer> getProductos() {
        return productos;
    }
    
    public int getId() {
        return id;
    }
}

