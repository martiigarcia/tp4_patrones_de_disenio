package ejercicios.punto2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProyectoTest {

    private TareaGeneral tarea1, tarea2, tarea3, tarea4, tarea5;
    private HistoriaDeUsuario historiaDeUsuario1, historiaDeUsuario2;
    private Proyecto scrum;
    private final double TIEMPO_NECESARIO_DEL_PROYECTO = 115;
    private final double TIEMPO_NECESARIO_DE_HISTRIA = 30;


    @BeforeEach
    public void hacerSetUp(){
        tarea1 = new Tarea(10);
        tarea2 = new Spike(20);
        tarea3 = new Tarea(30);
        tarea4 = new Spike(40);

        historiaDeUsuario1 = new HistoriaDeUsuario();
        historiaDeUsuario1.agregarTarea(tarea1);
        historiaDeUsuario1.agregarTarea(tarea2);

        historiaDeUsuario2 = new HistoriaDeUsuario();
        historiaDeUsuario2.agregarTarea(tarea3);
        historiaDeUsuario2.agregarTarea(tarea4);

        tarea5 = new Spike(15);

        scrum = new Proyecto();
        scrum.agregarHistoriaDeUsuario(historiaDeUsuario1);
        scrum.agregarHistoriaDeUsuario(historiaDeUsuario2);
        scrum.agregarHistoriaDeUsuario(tarea5);
    }

    @Test
    public void verificarTiempoNecesarioDelProyecto(){
        assertEquals(TIEMPO_NECESARIO_DEL_PROYECTO, scrum.obtenerTiempoNecesario());
    }
    @Test void verificarTiempoNecesarioDeUnaHistoria(){
        assertEquals(TIEMPO_NECESARIO_DE_HISTRIA, historiaDeUsuario1.obtenerTiempoTotal());
    }
}
