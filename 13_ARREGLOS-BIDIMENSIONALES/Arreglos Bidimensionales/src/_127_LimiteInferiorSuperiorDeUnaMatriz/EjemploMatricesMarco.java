public class EjemploMatricesMarco {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];  // Crear una matriz de tamaño 5x5

        // Llenar la matriz con un marco y diagonal de 1
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == 0 || i == matriz.length - 1
                        || j == 0 || j == matriz[i].length -1 || i == j){
                    matriz[i][j] = 1;  // Asignar 1 en las posiciones de los bordes y la diagonal principal
                }
            }
        }

        // Imprimir la matriz
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");  // Imprimir el elemento en la posición (i, j) seguido de una tabulación
            }
            System.out.println();  // Imprimir una nueva línea al final de cada fila
        }
    }
}
