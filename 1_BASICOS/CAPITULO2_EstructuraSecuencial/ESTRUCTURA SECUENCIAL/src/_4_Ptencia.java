import java.util.Scanner;

public class _4_Ptencia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese base: ");
        int base = entrada.nextInt();
        System.out.print("Ingrese exponente: ");
        int exponente = entrada.nextInt();

        int potencia = (int) Math.pow(base , exponente);

        System.out.println("potencia = " + potencia);
        
    }
}
