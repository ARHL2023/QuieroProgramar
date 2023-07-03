package _242_HashSetBuscarDuplicado;

import java.util.HashSet;
import java.util.Set;

public class HashSetBuscarDuplicado_Unicos {
    public static void main(String[] args) {

        //DEFINE ARRAY CON ALGUN DATO DUPLICADO
        String peces[] = {"Corvina","Lenguado","atun","atun","Robalo","Robalo","libra"};

        //EN EL HASHET SE ALMACENARAN LOS ELEMENTOS UNICOS
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        //ITERAMOS SOBRE CADA ELEMENTO (FOREACH)
        for (String pez : peces){
            if(!unicos.add(pez)){
                duplicados.add(pez);//agrega a duplicados los repetidos
            }
        }

        unicos.removeAll(duplicados);//elimina todos los duplicados de unicos

        System.out.println("Duplicados: "+duplicados);
        System.out.println("Unicos: "+unicos);


    }

}
