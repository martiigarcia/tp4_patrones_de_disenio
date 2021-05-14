package ejercicios.punto5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ejercicios.punto5.primerOpcion.*;

public class RemerasTest1 {

    Remera remeraNacional = new RemeraNacional(10);
    Remera remeraImportada = new RemeraImportada(10);

    private final double MONTO_TOTAL_REMERA_NACIONAL = 9.65;
    private final double MONTO_TOTAL_REMERA_IMPORTADA = 13.3;

    @Test
    public void verificarPrecioRemeraNacional(){
        assertEquals(MONTO_TOTAL_REMERA_NACIONAL, remeraNacional.calcularPrecioTotal());
    }
    @Test
    public void verificarPrecioRemeraImportada(){
        assertEquals(MONTO_TOTAL_REMERA_IMPORTADA, remeraImportada.calcularPrecioTotal());
    }

}
