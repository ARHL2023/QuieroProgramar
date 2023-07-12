public class EjemploMatricesTranspuesta {
    public static void main(String[] args) {
        // Declaración e inicialización de la matriz original
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Imprimir la matriz original
        System.out.println("Matriz original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int aux;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                // Intercambiar los elementos de la fila i con los elementos de la columna j

                // Guardar temporalmente el valor de la posición i, j en la variable aux
                aux = matriz[i][j];

                // Asignar el valor de la posición j, i al elemento en la posición i, j
                matriz[i][j] = matriz[j][i];

                // Asignar el valor guardado en aux al elemento en la posición j, i
                matriz[j][i] = aux;
            }
        }


        // Imprimir la matriz transpuesta
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
