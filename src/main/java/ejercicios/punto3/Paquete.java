package ejercicios.punto3;

import java.util.ArrayList;
import java.util.List;

public class Paquete implements Producto{

    private List<Producto> listaProducto = new ArrayList<>();

    public void agregarSeguro(Producto producto) {
        listaProducto.add(producto);
    }

    public List<Producto> recuperarlistaProducto() {
        return listaProducto;
    }

    public double obtenerMontoTotal() {
        double monto = 0;
        for (Producto producto : listaProducto) {
            monto = monto + producto.obtenerMontoTotal();
        }
        return monto;
    }

}
