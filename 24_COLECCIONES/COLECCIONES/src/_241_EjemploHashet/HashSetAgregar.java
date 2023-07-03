package _241_EjemploHashet;

import java.util.HashSet;
import java.util.Set;

public class HashSetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();

        System.out.println(hs.add("1")); // Agrega "1" al HashSet, devuelve true

        hs.add("2");
        hs.add("3");
        hs.add("4");

        System.out.println(hs); // Imprime los elementos del HashSet en cualquier orden

        boolean b = hs.add("4"); // Intenta agregar "4" nuevamente, se ignora ya que es un duplicado, devuelve false
        System.out.println("b = " + b); // Imprime false, ya que el elemento no se agregó nuevamente
        System.out.println(hs); // Imprime los elementos del HashSet, sin duplicados

    }
}
