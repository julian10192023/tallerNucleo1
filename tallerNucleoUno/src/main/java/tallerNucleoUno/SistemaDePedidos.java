package tallerNucleoUno;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SistemaDePedidos {
    // esta estructura nos ofrece un rendimiento bastante alto para la busqueda de un prodcuto a partir de su Sku.
    private Map<String, Producto> catalogoProductos;
    
    // LinkedList implementa Queue y garantiza FIFO para procesamiento de órdenes.
    private Queue<Orden> colaDePedidos;
    
    public SistemaDePedidos() {
        this.catalogoProductos = new HashMap<>();
        this.colaDePedidos = new LinkedList<>();
    }
    
    public void agregarProductoAlCatalogo(Producto producto) {
        catalogoProductos.put(producto.getSku(), producto);
    }
    
    public Producto buscarProducto(String sku) {
        return catalogoProductos.get(sku);
    }
    
    public void registrarOrden(Orden orden) {
        colaDePedidos.offer(orden);
    }
    
    public Orden procesarSiguienteOrden() {
        if (colaDePedidos.isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }
        
        Orden orden = colaDePedidos.poll();
        System.out.println("Procesando Orden #" + orden.getId() + " con total de $" + (int)orden.calcularTotal());
        return orden;
    }
    
    public static <T> void imprimirColeccion(String titulo, Collection<T> coleccion) {
        System.out.println(titulo);
        for (T elemento : coleccion) {
            System.out.println(elemento);
        }
    }
    
    public Queue<Orden> getColaDePedidos() {
        return colaDePedidos;
    }
}
