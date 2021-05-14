package ejercicios.punto5.primerOpcion;

public class RemeraNacional extends Remera {

    //1,5% recargo del costo de transporte
    //bonificacion 20%
    //15% del comercio para precio final

    public RemeraNacional(double precioUnitario){
        super(precioUnitario);
    }

    public double calcularRecargo(double precioUnitario){
        return (precioUnitario * 0.015) + (precioUnitario * 0.20) + (precioUnitario * 0.15);
    }
}
