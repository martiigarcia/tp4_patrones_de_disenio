package ejercicios.punto3;

public class Main {

    public static void main(String[] args) {

        Producto seguro1 = new Seguro(10);
        Producto seguro2 = new Seguro(20);
        Producto seguro3 = new Seguro(30);

        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete();

        paquete1.agregarSeguro(seguro1);
        paquete1.agregarSeguro(seguro2);

        paquete2.agregarSeguro(seguro3);
        paquete2.agregarSeguro(paquete1);

        System.out.println("Monto del paquete 1: " + paquete1.obtenerMontoTotal());
        System.out.println("Monto del paquete 2: " + paquete2.obtenerMontoTotal());


    }
}
