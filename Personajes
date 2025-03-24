
package javonesymazmorras;

public class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.inventario = new Inventario();
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Puntos de Vida: " + puntosVida);
    }

    public void bajarVida(int vida) {
        puntosVida -= vida;
        if (puntosVida < 0) puntosVida = 0;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void agregarEquipamiento(Equipamiento equipamiento) {
        inventario.agregarEquipamiento(equipamiento);
    }
}
