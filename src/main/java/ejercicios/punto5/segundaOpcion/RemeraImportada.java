package ejercicios.punto5.segundaOpcion;

public class RemeraImportada extends Remera {

    public RemeraImportada(double precioUnitario){
        super(precioUnitario);
    }
    @Override
    protected double calcularRecargo(double precioUnitario){
        return (precioUnitario * 0.08) ;
    }
    @Override
    protected double calcularBonificaciones(double precioUnitario){
        return (precioUnitario * 0);
    }
    @Override
    protected double calcularAumentoDelNegocio(double precioUnitario){
        return (precioUnitario * 0.25);
    }
}
