package ejercicios.punto2;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    private final List<Item> listaItems = new ArrayList<>();

    public double obtenerTiempoNecesario(){
        double tiempo = 0;
        for (Item item : listaItems){
            tiempo = tiempo + item.obtenerTiempoTotal();
        }
        return tiempo;
    }

    public void agregarHistoriaDeUsuario(Item item){
        listaItems.add(item);
    }
}
