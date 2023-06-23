package mx.com.gm.ventas;

public class Orden {

    private int idOrden;
    private Producto[] productos;
    private static int contadorOrdenes;
    private static int MAX_PRODUCTOS;

    public Orden(){
        idOrden = ++contadorOrdenes;
        MAX_PRODUCTOS = ++contadorOrdenes;
    };
    public void agregarProducto(){

    }
    public double calcularTotal(){
    return contadorOrdenes;
    }
    public void mostrarOrden(){

    }

}
