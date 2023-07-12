public class ProgramaSilla {
    public static void main(String[] args) {

        int n = 10; // Tamaño de la silla

        if (n == 0) {
            System.out.println("ERROR");
            return; // Finalizar la ejecución del programa si n es igual a cero
        }

        int[][] matriz = new int[n][n]; // Crear una matriz de tamaño n x n

        // Llenar la matriz con ceros
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0; // Asignar cero en todas las posiciones de la matriz
            }
        }

        // Construir la silla en la matriz
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = 1; // Rellenar la primera columna con unos
            matriz[matriz.length / 2][i] = 1; // Rellenar la fila central con unos
            matriz[i][matriz.length - 1] = 1; // Rellenar la última columna con unos
        }

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]); // Imprimir el elemento en la posición (i, j)
            }
            System.out.println(); // Imprimir una nueva línea al final de cada fila
        }
    }
}
