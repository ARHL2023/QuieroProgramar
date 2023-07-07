package _100_BurbujaMetodoOptimizado;

public class BurbujaOptimizado {
    public static void main(String[] args) {

        String[] productos = {"telefono", "table", "laptop", "cpmputadora", "celular", "smartphone", "iphone"};

        System.out.println("Metodo burbuja\n");

        int total = productos.length;
        int contador = 0;
        int contadorDelMejorado = 0;

        System.out.println("\nNormal");

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                // Compara el elemento en la posición "i" con el elemento en la posición "j"
                // utilizando el método compareTo() de la clase String.
                // Si el resultado de la comparación es menor que 0, significa que el elemento en la posición "i" es menor que el elemento en la posición "j",
                // por lo tanto, se debe realizar un intercambio.
                if (productos[i].compareTo(productos[j]) < 0) {
                    // Realiza el intercambio de elementos utilizando una variable auxiliar.
                    // Asigna el valor del elemento en la posición "i" a la variable auxiliar.
                    String auxiliar = productos[i];
                    // Asigna el valor del elemento en la posición "j" al elemento en la posición "i".
                    productos[i] = productos[j];
                    // Asigna el valor de la variable auxiliar al elemento en la posición "j".
                    productos[j] = auxiliar;
                }
                // Incrementa un contador para llevar un seguimiento de las comparaciones realizadas.
                contador++;
            }
        }


        System.out.println("\nMejorado");

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                // Compara el elemento en la posición "j+1" con el elemento en la posición "j"
                // utilizando el método compareTo() de la clase String.
                // Si el resultado de la comparación es menor que 0, significa que el elemento en la posición "j+1" es menor que el elemento en la posición "j",
                // por lo tanto, se debe realizar un intercambio.
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    // Realiza el intercambio de elementos utilizando una variable auxiliar.
                    // Asigna el valor del elemento en la posición "j" a la variable auxiliar.
                    String auxiliar = productos[j];
                    // Asigna el valor del elemento en la posición "j+1" al elemento en la posición "j".
                    productos[j] = productos[j + 1];
                    // Asigna el valor de la variable auxiliar al elemento en la posición "j+1".
                    productos[j + 1] = auxiliar;
                }
                // Incrementa un contador para llevar un seguimiento de las comparaciones realizadas.
                contadorDelMejorado++;
            }
        }


        for (String p : productos) {
            System.out.println(p);
        }

        System.out.println("\nCantidad de iteraciones: " + contador);
        System.out.println("\nCantidad de iteraciones del mejorado: " + contadorDelMejorado);

    }
}
