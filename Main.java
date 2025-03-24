package javonesymazmorras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear personajes
        Mago mago = new Mago("Gandalf", 10, 100, 50);
        Guerrero guerrero = new Guerrero("Conan", 12, 150);
        Ladron ladron = new Ladron("Lupin", 8, 90);

        System.out.println("¡Bienvenido a Javones y Mazmorras!");
        System.out.println("Elige un personaje para jugar:");
        System.out.println("1. Mago\n2. Guerrero\n3. Ladrón");

        int opcion = scanner.nextInt();
        Personaje jugador;

        switch (opcion) {
            case 1:
                jugador = mago;
                System.out.println("Has elegido al Mago.");
                break;
            case 2:
                jugador = guerrero;
                System.out.println("Has elegido al Guerrero.");
                break;
            case 3:
                jugador = ladron;
                System.out.println("Has elegido al Ladrón.");
                break;
            default:
                System.out.println("Opción no válida. Se elige por defecto al Guerrero.");
                jugador = guerrero;
        }

        boolean jugando = true;
        while (jugando) {
            System.out.println("\n¿Qué quieres hacer?");
            System.out.println("1. Ver información del personaje");
            System.out.println("2. Atacar (bajar vida)");
            System.out.println("3. Usar habilidad especial");
            System.out.println("4. Ver inventario");
            System.out.println("5. Salir");

            int accion = scanner.nextInt();

            switch (accion) {
                case 1:
                    jugador.mostrarInfo();
                    break;
                case 2:
                    System.out.println("¿Cuánta vida quieres bajar?");
                    int daño = scanner.nextInt();
                    jugador.bajarVida(daño);
                    System.out.println("¡Has recibido daño!");
                    break;
                case 3:
                    if (jugador instanceof Mago) {
                        System.out.println("Introduce la cantidad de maná a usar:");
                        int mana = scanner.nextInt();
                        ((Mago) jugador).lanzarHechizo(mana);
                    } else if (jugador instanceof Guerrero) {
                        ((Guerrero) jugador).proteger(mago);
                    } else if (jugador instanceof Ladron) {
                        ((Ladron) jugador).hacerseInvisible();
                        System.out.println("Ahora el ladrón es invisible.");
                    }
                    break;
                case 4:
                    jugador.getInventario().mostrarInventario();
                    break;
                case 5:
                    System.out.println("Saliendo del juego...");
                    jugando = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
