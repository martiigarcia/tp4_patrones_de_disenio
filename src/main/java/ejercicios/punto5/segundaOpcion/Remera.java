package ejercicios.punto5.segundaOpcion;

public abstract class Remera {

    double precioUnitario;

    public Remera(double precioUnitario){
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioTotal(){
        double montoTotal = precioUnitario;
        montoTotal = montoTotal + this.calcularRecargo(precioUnitario);
        montoTotal = montoTotal - this.calcularBonificaciones(precioUnitario);
        montoTotal = montoTotal + this.calcularAumentoDelNegocio(precioUnitario);
        return montoTotal;
    }

    protected abstract double calcularRecargo(double precioUnitario);

    protected abstract double calcularBonificaciones(double precioUnitario);

    protected abstract double calcularAumentoDelNegocio(double precioUnitario);

}
