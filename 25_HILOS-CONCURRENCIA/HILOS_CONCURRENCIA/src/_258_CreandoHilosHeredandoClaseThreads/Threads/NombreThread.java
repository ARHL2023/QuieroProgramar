package _258_CreandoHilosHeredandoClaseThreads.Threads;

public class NombreThread extends Thread {
    public NombreThread(String name) {
        // Llamar al constructor de la clase Thread para asignar el nombre al hilo
        super(name);
    }

    // Sobrescribir el método run que contiene el código a ejecutar en el hilo
    @Override
    public void run() {
        System.out.println("Se inicializa el método run del hilo: " + getName());

        // Ejecutar un bucle 10 veces
        for (int i = 0; i < 10; i++) {
            try {
                // Pausar el hilo durante 10 milisegundos
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // Capturar la excepción InterruptedException y lanzar una nueva excepción RuntimeException
                // con la excepción original como argumento para propagarla
                throw new RuntimeException(e);
            }

            // Imprimir el nombre del hilo actual
            System.out.println(this.getName());
        }

        System.out.println("Finaliza el hilo");
    }
}