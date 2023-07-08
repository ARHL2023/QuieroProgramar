import java.util.Scanner;

public class _3_Iva {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final double iva = 0.19;

        System.out.print("Ingrese precio de venta: ");
        double precio = entrada.nextDouble();

        double subtotal = precio*iva;

        System.out.println("subtotal = " + subtotal);
        
        double total = precio + subtotal;


        System.out.println("total =  " + total);

    }
}
