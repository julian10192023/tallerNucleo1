package tallerNucleoUno;

public class Main {
    public static void main(String[] args) {
        SistemaDePedidos sistema = new SistemaDePedidos();
        
        Producto laptop = new Producto("LAP001", "Laptop Gaming", 6500000);
        Producto mouse = new Producto("MOU001", "Mouse", 120000);
        Producto teclado = new Producto("TEC001", "Teclado", 380000);
        
        sistema.agregarProductoAlCatalogo(laptop);
        sistema.agregarProductoAlCatalogo(mouse);
        sistema.agregarProductoAlCatalogo(teclado);
        
        Orden orden1 = new Orden(1);
        orden1.agregarProducto(laptop);
        orden1.agregarProducto(mouse, 2);
        orden1.agregarProducto(mouse);
        
        Orden orden2 = new Orden(2);
        orden2.agregarProducto(teclado);
        orden2.agregarProducto(laptop);
        
        Orden orden3 = new Orden(3);
        orden3.agregarProducto(mouse);
        orden3.agregarProducto(teclado, 2);
        orden3.agregarProducto(teclado);
        
        sistema.registrarOrden(orden1);
        sistema.registrarOrden(orden2);
        sistema.registrarOrden(orden3);
        
        SistemaDePedidos.imprimirColeccion("Cola de pedidos:", sistema.getColaDePedidos());
        
        System.out.println("\nProcesando ordenes:");
        Orden procesada;
        while ((procesada = sistema.procesarSiguienteOrden()) != null) {
            // procesa orden
        }
        
        sistema.procesarSiguienteOrden();
        
        System.out.println("\nProductos unicos orden 1:");
        SistemaDePedidos.imprimirColeccion("", orden1.obtenerProductosUnicos());
        
        System.out.println("\nProductos unicos orden 3:");
        SistemaDePedidos.imprimirColeccion("", orden3.obtenerProductosUnicos());
    }
}