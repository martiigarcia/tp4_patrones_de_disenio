package ejercicios.punto1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EmpresaTest {

    private EmpleadoRegular empleado1, empleado2, empleado3;
    private EmpleadoAlMando empleado4, empleado5, empleado6;
    private final Empresa laserX = new Empresa();
    private final double MONTO_DE_LA_EMPRESA_ESPERADO = 180;

    @BeforeEach
    public void hacerSetup() {
        empleado1 = new EmpleadoRegular(20, "Pepe");
        empleado2 = new EmpleadoRegular(20, "Anabel");
        empleado3 = new EmpleadoRegular(20, "Juan");

        empleado4 = new EmpleadoAlMando(30, "Jose");
        empleado5 = new EmpleadoAlMando(30, "Maria");
        empleado6 = new EmpleadoAlMando(60, "Martina");

        empleado4.agregarEmpleado(empleado1);
        empleado5.agregarEmpleado(empleado2);
        empleado5.agregarEmpleado(empleado3);

        empleado6.agregarEmpleado(empleado4);
        empleado6.agregarEmpleado(empleado5);

        laserX.agregarDirectorDeLaEmpresa(empleado6);
    }

    @Test
    public void verificarMontoTotalDeLaEmpresa() {

        assertEquals(MONTO_DE_LA_EMPRESA_ESPERADO, laserX.obtenerSalarioTotalDeEmpresa());

    }


}
