package ejercicios.punto4;

import static java.time.LocalDate.now;

public class CalculadorNoJubilado extends Calculador {

    public CalculadorNoJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }


    @Override
    protected double mesSinPromocion(double precioProducto) {
        return (precioProducto * 0.21) + precioProducto;
    }

    @Override
    protected double mesEnPromocion(double precioProducto) {
        return (precioProducto * 0.15) + precioProducto;
    }
}