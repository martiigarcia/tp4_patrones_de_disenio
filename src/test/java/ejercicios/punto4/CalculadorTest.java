package ejercicios.punto4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static java.time.LocalDate.now;

public class CalculadorTest {

    @Test
    public void verificarJubiladoSINPromocion(){
        Calculador calculador = new CalculadorJubilado(now().getMonth().getValue() -1);
        double resultado = calculador.calcularPrecio(100);
        Assertions.assertEquals(110 , resultado);
    }
    @Test
    public void verificarJubiladoCONPromocion(){
        Calculador calculador = new CalculadorJubilado(now().getMonth().getValue());
        double resultado = calculador.calcularPrecio(100);
        Assertions.assertEquals(100, resultado);
    }

    @Test
    public void verificarNOJubiladoSINPromocion(){
        Calculador calculador = new CalculadorNoJubilado(now().getMonth().getValue() -1);
        double resultado = calculador.calcularPrecio(100);
        Assertions.assertEquals(121, resultado);
    }
    @Test
    public void verificarNOJubiladoCONPromocion(){
        Calculador calculador = new CalculadorNoJubilado(now().getMonth().getValue());
        double resultado = calculador.calcularPrecio(100);
        Assertions.assertEquals(115, resultado);
    }

}
