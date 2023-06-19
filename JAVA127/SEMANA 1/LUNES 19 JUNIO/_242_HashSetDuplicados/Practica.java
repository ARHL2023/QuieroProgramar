//Enunciado:
//        Escribe un programa en Java que solicite al usuario ingresar una serie de palabras separadas por espacios.
//        El programa debe almacenar las palabras ingresadas en un HashSet y
//        luego mostrar por pantalla la cantidad de palabras ingresadas
//        y la lista de palabras sin duplicados
//
//        Puedes comenzar solicitando al usuario que ingrese las palabras y luego implementar
//        la lógica para almacenar las palabras en un HashSet y mostrar la cantidad de palabras ingresadas
//        y la lista de palabras sin duplicados en el orden en que fueron ingresadas.

package _242_HashSetDuplicados;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practica {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //solcito tamaño para el arreglo
        System.out.println("Cantidad de palabras a ingresar: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        //ARREGLO DEL TAMANIO DE LO SOLICITADO POR TECLADO
        String palabras[]=new String[cantidad];

        //SET DONDE TENDRE LAS LISTAS
        Set<String>lista = new HashSet<>();
        Set<String>listaRepetida = new HashSet<>();

        //INGRESO LAS PALABRAS Y ALAMECENO EN EL ARREGLO
        for (int i=0; i<cantidad;i++){
            System.out.println("Ingrese palabra "+(i+1));
            palabras[i] = entrada.nextLine();
        }

        //ver duplicados
        for (String palabra : palabras) {
            if (!lista.add(palabra)) {
                listaRepetida.add(palabra);//AGREGA LOS DUPLICADOS A SU LISTA
            }
        }

        lista.removeAll(listaRepetida);//ELIMINA LOS DUPLICADOS

        System.out.println("\nPalabras repeitidas--> "+listaRepetida);
        System.out.println("Cantidad de palabras: "+lista.size() +" la lista es--> "+lista);

    }//main
}//class
