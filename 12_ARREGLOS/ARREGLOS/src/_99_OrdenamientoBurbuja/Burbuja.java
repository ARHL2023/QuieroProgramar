package _99_OrdenamientoBurbuja;

public class Burbuja {
    public static void main(String[] args) {

        String[] productos = {"telefono", "table", "laptop", "cpmputadora", "celular","smartphone","iphone"};

        System.out.println("Metodo burbuja\n");

        int total = productos.length;
        int contador = 0;

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


        for (String p : productos){
            System.out.println(p);
        }

        System.out.println("\nCantidad de iteraciones: "+contador);

    }
}
