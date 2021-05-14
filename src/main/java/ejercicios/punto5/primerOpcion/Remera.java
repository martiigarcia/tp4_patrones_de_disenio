package ejercicios.punto5.primerOpcion;

public abstract class Remera {

    double precioUnitario;

    public Remera(double precioUnitario){
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioTotal(){
        return precioUnitario + this.calcularRecargo(precioUnitario);
    }

    protected abstract double calcularRecargo(double precioUnitario);

}
