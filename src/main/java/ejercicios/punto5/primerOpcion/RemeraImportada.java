package ejercicios.punto5.primerOpcion;

public class RemeraImportada extends Remera {

    public RemeraImportada(double precioUnitario){
        super(precioUnitario);
    }

    public double calcularRecargo(double precioUnitario){
        return (precioUnitario * 0.08) + (precioUnitario * 0) + (precioUnitario * 0.25);
    }
}
