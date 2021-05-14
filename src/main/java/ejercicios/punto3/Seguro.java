package ejercicios.punto3;

public class Seguro implements Producto{

    private double monto;

    public Seguro(double monto){
        this.monto = monto;
    }

    public double obtenerMontoTotal(){
        return monto;
    }



}
