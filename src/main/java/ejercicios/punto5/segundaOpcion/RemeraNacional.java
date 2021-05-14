package ejercicios.punto5.segundaOpcion;

public class RemeraNacional extends Remera {

    //1,5% recargo del costo de transporte
    //bonificacion 20%
    //15% del comercio para precio final

    public RemeraNacional(double precioUnitario){
        super(precioUnitario);
    }
    @Override
    protected double calcularRecargo(double precioUnitario){
        return (precioUnitario * 0.015) ;
    }
    @Override
    protected double calcularBonificaciones(double precioUnitario){
        return (precioUnitario * 0.20);
    }
    @Override
    protected double calcularAumentoDelNegocio(double precioUnitario){
        return (precioUnitario * 0.15);
    }
}
