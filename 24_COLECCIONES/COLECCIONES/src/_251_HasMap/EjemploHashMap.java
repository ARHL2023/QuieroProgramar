package _251_HasMap;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();

        //put es como add, ingresa por llave y valor
        //las llaves siempre seran unicas, el valor si se puede repetir
        //si se repite el valor toma el ultimo
        persona.put(null,"aaaa");
        persona.put("Nombre", "Lady");
        persona.put("Apellido", "Mite");
        persona.put("Correo", "micorreo@gmail.com");
        persona.put("Edad", "28");

        System.out.println("persona = " + persona);

        //OBTENER UN VALOR A TRAVES DE LA LLAVE
        String nombre = persona.get("Nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("Apellido");
        System.out.println("apellido = " + apellido);

    }
}
