package ejercicios.punto3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;


public class ProductoTest {

    private Producto seguro1, seguro2, seguro3;
    private Paquete paquete1, paquete2;
    private final double MONTO_PAQUETE_SEGUROS = 28.5;
    private final double MONTO_PAQUETE_SEGUROS_Y_PAQUETES = 55.5;



    @BeforeEach
    public void hacerSetUp() {
        seguro1 = new Seguro(10);
        seguro2 = new Seguro(20);
        seguro3 = new Seguro(30);

        paquete1 = new Paquete();
        paquete2 = new Paquete();

        paquete1.agregarSeguro(seguro1);
        paquete1.agregarSeguro(seguro2);

        paquete2.agregarSeguro(seguro3);
        paquete2.agregarSeguro(paquete1);
    }

    @Test
    public void verificarMontoPaqueteDeSeguros() {

        assertEquals(MONTO_PAQUETE_SEGUROS, paquete1.obtenerMontoTotal());

    }

    @Test
    public void verificarMontoPaqueteDePaquetesYProductos() {

        assertEquals(MONTO_PAQUETE_SEGUROS_Y_PAQUETES, paquete2.obtenerMontoTotal(), 1);
    }


}
