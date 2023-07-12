//Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz y utilizar el carácter guion bajo como relleno. El tamaño de la x se basa en una variable n que indicará el tamaño de la letra para imprimir en una matriz de n x n.
//
//        El carácter "X" en mayúscula y el guion bajo "_" para los espacios.
//
//        Por ejemplo para n=5 se obtiene:
//
//        X___X
//        _X_X_
//        __X__
//        _X_X_
//        X___X
//        Por ejemplo para n=6 se obtiene:
//
//        X____X
//        _X__X_
//        __XX__
//        __XX__
//        _X__X_
//        X____X
//        Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.

public class ProgramaLetraX {
    public static void main(String[] args) {

        int n = 6; // Tamaño de la letra X

        if (n == 0) {
            System.out.println("ERROR");
            return; // Finalizar la ejecución del programa si n es igual a cero
        }

        char[][] matriz = new char[n][n]; // Crear una matriz de tamaño n x n

        // Llenar la matriz con guiones bajos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '_'; // Asignar guión bajo en todas las posiciones de la matriz
            }
        }

        // Colocar la letra X en las diagonales de la matriz
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = 'X'; // Colocar X en la diagonal principal
            matriz[i][matriz.length - 1 - i] = 'X'; // Colocar X en la diagonal secundaria
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
