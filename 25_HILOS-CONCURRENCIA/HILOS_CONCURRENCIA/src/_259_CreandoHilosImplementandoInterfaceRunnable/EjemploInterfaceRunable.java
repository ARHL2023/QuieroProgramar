package _259_CreandoHilosImplementandoInterfaceRunnable;

import _259_CreandoHilosImplementandoInterfaceRunnable.Runnable.ViajeTarea;

// Clase principal que contiene el método main para iniciar los hilos de viaje
public class EjemploInterfaceRunable {
    public static void main(String[] args) throws InterruptedException {
        // Creamos instancias de la clase ViajeTarea y las pasamos a nuevos hilos
        new Thread(new ViajeTarea("Isla de Pascua")).start();
        new Thread(new ViajeTarea("La casa de mi novia")).start();
        new Thread(new ViajeTarea("Motel 593")).start();
    }
}
