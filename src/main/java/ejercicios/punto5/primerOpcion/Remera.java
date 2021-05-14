package ejercicios.punto5.primerOpcion;

public abstract class Remera {

    double precioUnitario;

    public Remera(double precioUnitario){
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioTotal(){
        double montoTotal = 0;
        montoTotal = montoTotal + this.calcularRecargo(precioUnitario);
        return montoTotal;
    }

    protected abstract double calcularRecargo(double precioUnitario);

}
