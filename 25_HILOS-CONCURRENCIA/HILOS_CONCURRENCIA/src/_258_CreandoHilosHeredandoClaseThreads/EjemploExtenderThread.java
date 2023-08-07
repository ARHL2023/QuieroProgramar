package _258_CreandoHilosHeredandoClaseThreads;

import _258_CreandoHilosHeredandoClaseThreads.Threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {

        // Crear una instancia de la clase NombreThread pasando el nombre del hilo como argumento
        Thread hilo = new NombreThread("Lady Amor");

        // Iniciar el hilo
        hilo.start();
        System.out.println(hilo.getState());

        // Crear otra instancia de la clase NombreThread pasando el nombre del hilo como argumento
        Thread hilo2 = new NombreThread("Soy Andy");
        // Iniciar el segundo hilo
        hilo2.start();
        System.out.println(hilo.getState());
    }
}