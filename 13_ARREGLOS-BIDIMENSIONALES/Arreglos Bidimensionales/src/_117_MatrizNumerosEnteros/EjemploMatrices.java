public class EjemploMatrices {
    public static void main(String[] args) {

        // Crear una matriz de tamaño 2x4
        int[][] numeros = new int[2][4];

        // Asignar valores a los elementos de la matriz
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        // Obtener el número de filas y columnas de la matriz
        System.out.println("Número de filas: " + numeros.length);
        System.out.println("Número de columnas: " + numeros[0].length);

        // Acceder al primer elemento de la matriz
        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);

        // Acceder al último elemento de la matriz
        System.out.println("Último elemento: " + numeros[numeros.length - 1][numeros[1].length - 1]);

        // Asignar valores individuales a variables separadas
        int num1 = numeros[0][0];
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];
        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];
        int num8 = numeros[1][3];

        // Imprimir los valores asignados a las variables
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
    }
}
