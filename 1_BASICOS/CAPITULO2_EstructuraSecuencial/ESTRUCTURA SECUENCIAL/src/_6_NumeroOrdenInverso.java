import java.util.Scanner;

public class _6_NumeroOrdenInverso {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nMetodos de java");

        System.out.print("Ingrese un número entero: ");
        int numero = entrada.nextInt();

        // Método utilizando StringBuilder y reverse()
        String numeroInvertido = new StringBuilder(String.valueOf(numero)).reverse().toString();

        System.out.println("El número ingresado invertido es: " + numeroInvertido);


        //////////////////////////////////   //////////////////////////////////   //////////////////////////////////
        System.out.println("\nMetodo Logico");

        int numeroInvertido2 = 0;
        int r;

        // Obtener el último dígito del número original
        r = numero % 10;  // Obtengo el último dígito del número original
        numero = numero / 10;  // Elimino el último dígito del número original
        numeroInvertido2 = r * 10;  // Almaceno el último dígito en el número invertido (como primer dígito)

        // Obtener el siguiente dígito del número original
        r = numero % 10;  // Obtengo el siguiente dígito del número original
        numero = numero / 10;  // Elimino el siguiente dígito del número original
        numeroInvertido2 = (numeroInvertido2 + r) * 10;  // Agrego el siguiente dígito al número invertido

        // Obtener el siguiente dígito del número original
        r = numero % 10;  // Obtengo el siguiente dígito del número original
        numero = numero / 10;  // Elimino el siguiente dígito del número original
        numeroInvertido2 = (numeroInvertido2 + r) * 10;  // Agrego el siguiente dígito al número invertido

        // Obtener el siguiente dígito del número original
        r = numero % 10;  // Obtengo el siguiente dígito del número original
        numero = numero / 10;  // Elimino el siguiente dígito del número original
        numeroInvertido2 = (numeroInvertido2 + r) * 10;  // Agrego el siguiente dígito al número invertido

        // Agregar el primer dígito del número original al número invertido
        numeroInvertido2 = numeroInvertido2 + numero;  // Agrego el primer dígito al número invertido


        System.out.println("El número ingresado invertido es: " + numeroInvertido2);

    }
}
