package _94_EjemploArregloEnteros;

public class EjemploArreglos {

    public static void main(String[] args) {

        // Declaración e inicialización de un arreglo de enteros con capacidad para 5 elementos
        int [] enteros = new int[5];

        // Asignación del valor elemento del arreglo
        enteros[0] = 1;
        enteros[1] = Integer.valueOf("2"); // Convierte la cadena "2" en un valor entero y lo asigna al segundo elemento del arreglo
        enteros[2] = 3;
        enteros[3] = 4;
        enteros[4] = 5;

        // Imprime elemento del arreglo
        System.out.println(enteros[0]);
        System.out.println(enteros[1]);
        System.out.println(enteros[2]);
        System.out.println(enteros[3]);
        System.out.println(enteros[4]);

        //Obtener ultimo eemento del arreglo
        int ultimo = enteros[enteros.length-1];

        System.out.println("ultimo = " + ultimo);


    }
}
