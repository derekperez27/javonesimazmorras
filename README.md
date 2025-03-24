ackage javonesymazmorras;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Equipamiento> equipamiento;

    public Inventario() {
        equipamiento = new ArrayList<>();
    }

    public void agregarEquipamiento(Equipamiento equipamiento) {
        this.equipamiento.add(equipamiento);
    }

    public void mostrarInventario() {
        for (Equipamiento e : equipamiento) {
            System.out.println(e.getNombre() + " (" + e.getTipo() + ")");
        }
    }
}
