package ejercicios.punto2;

public class Main {

    public static void main(String[] args) {

        TareaGeneral tarea1 = new Tarea(10);
        TareaGeneral tarea2 = new Spike(20);
        TareaGeneral tarea3 = new Tarea(30);
        TareaGeneral tarea4 = new Spike(40);

        HistoriaDeUsuario historiaDeUsuario1 = new HistoriaDeUsuario();
        historiaDeUsuario1.agregarTarea(tarea1);
        historiaDeUsuario1.agregarTarea(tarea2);

        HistoriaDeUsuario historiaDeUsuario2 = new HistoriaDeUsuario();
        historiaDeUsuario2.agregarTarea(tarea3);
        historiaDeUsuario2.agregarTarea(tarea4);

        TareaGeneral tarea5 = new Spike(15);

        Proyecto scrum = new Proyecto();
        scrum.agregarHistoriaDeUsuario(historiaDeUsuario1);
        scrum.agregarHistoriaDeUsuario(historiaDeUsuario2);
        scrum.agregarHistoriaDeUsuario(tarea5);

        System.out.println("Tiempo de hu1: "+historiaDeUsuario1.obtenerTiempoTotal());
        System.out.println("Tiempo de hu2: "+historiaDeUsuario2.obtenerTiempoTotal());
        System.out.println("\n------------------");
        System.out.println("-----PROYECTO-----");
        System.out.println("Tiempo de duracion del proyecto: "+ scrum.obtenerTiempoNecesario());
        System.out.println("\n------------------");

    }
}
