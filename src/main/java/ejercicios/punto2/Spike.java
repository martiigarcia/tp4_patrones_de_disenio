package ejercicios.punto2;

public class Spike extends TareaGeneral{

    public Spike(double tiempoTotal) {
        super(tiempoTotal);
    }

    @Override
    public double obtenerTiempoTotal() {
        return super.tiempoTotal;
    }
}
