package ejercicios.punto2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario implements Item{

    private final List<TareaGeneral> listaTareas = new ArrayList<>();
    private double tiempoTotalDeLaHistoria;

    public void agregarTarea (TareaGeneral tarea){
        listaTareas.add(tarea);
        this.tiempoTotalDeLaHistoria += tarea.obtenerTiempoTotal();
    }
    public List<TareaGeneral>recuperarListaTareas(){
        return listaTareas;
    }

    public double obtenerTiempoTotal() {
        return this.tiempoTotalDeLaHistoria;
    }
}
