package ejercicios.punto2;

public class Tarea extends TareaGeneral{


    public Tarea(double tiempoTotal) {
        super(tiempoTotal);
    }

    @Override
    public double obtenerTiempoTotal() {
        return super.tiempoTotal;
    }
}
