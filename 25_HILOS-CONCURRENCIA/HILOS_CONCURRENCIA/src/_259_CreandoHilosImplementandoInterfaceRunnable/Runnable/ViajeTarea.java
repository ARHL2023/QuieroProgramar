package _259_CreandoHilosImplementandoInterfaceRunnable.Runnable;

import java.util.Random;

// Clase que implementa la interfaz Runnable para representar una tarea de viaje
public class ViajeTarea implements Runnable {

    private String nombre;

    // Constructor para inicializar la tarea con un nombre
    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener el nombre de la tarea de viaje
    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        // Método run() es obligatorio para implementar Runnable y se ejecutará en el hilo
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "- " + nombre);
            try {
                // Simula una pausa aleatoria entre 0 y 1000 milisegundos
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                // Manejo de excepción si se produce una interrupción durante la pausa
                throw new RuntimeException(e);
            }
        }
        System.out.println("Nos vamos de viaje a " + nombre);
    }
}
