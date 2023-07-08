import java.util.Scanner;

//Problema n.° 1
//        Enunciado: Dado dos números enteros, hallar la suma.
public class _1_Suma2Numeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int numero2 = entrada.nextInt();

        int suma = numero1+numero2;

        System.out.println("suma = " + suma);

    }
}
