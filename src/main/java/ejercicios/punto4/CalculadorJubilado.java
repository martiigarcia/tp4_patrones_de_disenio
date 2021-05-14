package ejercicios.punto4;

import static java.time.LocalDate.now;

public class CalculadorJubilado extends Calculador {

    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    protected double mesSinPromocion(double precioProducto) {
        return (precioProducto* 0.1) +precioProducto;
    }

    @Override
    protected double mesEnPromocion(double precioProducto) {
        return precioProducto;
    }

    /*public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * 0.1;
        }
        log.log(CalculadorJubilado.class.getName());
        return precioTotal;
    }*/
}