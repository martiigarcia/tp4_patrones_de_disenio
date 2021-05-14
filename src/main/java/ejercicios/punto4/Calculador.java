package ejercicios.punto4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
    private LogTransaction log;
    private int mesEnPromocion;

    public Calculador(int mesEnPromocion){
        this.mesEnPromocion = mesEnPromocion;
        log = new LogTransaction();
    }

    public double calcularPrecio(double precioProducto){
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal = this.mesEnPromocion(precioProducto);
        } else {
            precioTotal = this.mesSinPromocion(precioProducto);
        }
        log.log(this.getClass().getName());
        return precioTotal;
    }

    protected abstract double mesSinPromocion(double precioProducto);

    protected abstract double mesEnPromocion(double precioProducto);
}