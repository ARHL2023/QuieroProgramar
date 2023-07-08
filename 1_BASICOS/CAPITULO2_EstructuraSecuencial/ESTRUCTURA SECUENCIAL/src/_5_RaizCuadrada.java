import java.util.Scanner;

public class _5_RaizCuadrada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese numero 1: ");
        int numero1 = entrada.nextInt();


        int raiz = (int) Math.sqrt(numero1);//PARA RAIZ CUADRADA
        System.out.println("raiz = " + raiz);

        System.out.println("\nRaiz a la N");

        double base = 16.0; // El número del cual deseas calcular la raíz
        int exponente = 4; // El valor de n para calcular la raíz n-ésima

        double resultado = Math.pow(base, 1.0 / exponente);
        System.out.println("La raíz " + exponente + "-ésima de " + base + " es: " + resultado);


    }
}
