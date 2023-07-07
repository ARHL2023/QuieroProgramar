package _101_ReutilizandoMetodoBurbujaEnteros;

public class BurbujaOptimizadoParaEnteros {
    public static void main(String[] args) {


        System.out.println("Metodo burbuja\n");

        int[] enteros = new int[5];

        // Asignación del valor elemento del arreglo
        enteros[0] = 11;
        enteros[1] = Integer.valueOf("20"); // Convierte la cadena "2" en un valor entero y lo asigna al segundo elemento del arreglo
        enteros[2] = 32;
        enteros[3] = 24;
        enteros[4] = 5;

        int total = enteros.length;
//        int contador = 0;
        int contadorDelMejorado = 0;


        System.out.println("\nMejorado");

        for (int i = 0; i < enteros.length - 1; i++) {
            for (int j = 0; j < enteros.length - 1 - i; j++) {
                // Dado que los elementos son de tipo int, no se puede utilizar el método compareTo().
                // En su lugar, se realiza un cast del elemento en la posición "j+1" a Integer y se utiliza el método compareTo() de Integer.
                if (((Integer) enteros[j + 1]).compareTo(enteros[j]) < 0) {//al sert int no puede usar compare to, pero puedo hacer un cast para no cambiar int a Integer
                    int auxiliar = enteros[j];
                    enteros[j] = enteros[j + 1];
                    enteros[j + 1] = auxiliar;
                }
                contadorDelMejorado++;
            }
        }

        for (int p : enteros) {
            System.out.println(p);
        }

        //System.out.println("\nCantidad de iteraciones: " + contador);
        System.out.println("\nCantidad de iteraciones del mejorado: " + contadorDelMejorado);

    }
}
