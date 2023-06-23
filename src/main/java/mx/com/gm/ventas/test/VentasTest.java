package mx.com.gm.ventas.test;
import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 5000);
        Producto producto2 = new Producto("Reloj", 87000);
        Producto producto3 = new Producto("Cuaderno", 200);
        Producto producto4 = new Producto("Cortinas", 1200);
        Producto producto5 = new Producto("Cargador", 4500);
        Producto producto6 = new Producto("Remera", 3700);
        Producto producto7 = new Producto("Cuota", 750);

        producto4.setPrecio(1150);
        producto7.setNombre("Cuota Social");

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto7);
        orden1.mostrarOrden();
        orden1.calcularTotal();

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.mostrarOrden();
        orden2.calcularTotal();
    }


}
