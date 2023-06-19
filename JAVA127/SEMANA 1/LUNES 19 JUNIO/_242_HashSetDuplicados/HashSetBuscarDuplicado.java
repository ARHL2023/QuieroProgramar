package _242_HashSetDuplicados;

import java.util.HashSet;
import java.util.Set;

public class HashSetBuscarDuplicado {
    public static void main(String[] args) {

        //DEFINE ARRAY CON ALGUN DATO DUPLICADO
       String peces[] = {"Corvina","Lenguado","atun","atun","Robalo","Robalo","libra"};

       //EN EL HASHET SE ALMACENARAN LOS ELEMENTOS UNICOS
       Set<String> unicos = new HashSet<>();

       //ITERAMOS SOBRE CADA ELEMENTO (FOREACH)
       for (String pez : peces){
           if(!unicos.add(pez)){
               //EL ADD DEVUELVE UN BOOLEAN (TRUE SI SE REGISTRA, FALSE ES DUPLICADO), SI ES DISTINTO ES PORQUE O SE REGISTRO
               System.out.println("Elemento duplicado: " +pez);
           }
       }

       //IMPRIMER TAMAÑO Y LOS ELEMENTOS NO DUPLICADOS
        System.out.println(unicos.size() + " elementos no duplicados "+ unicos);

    }
}
