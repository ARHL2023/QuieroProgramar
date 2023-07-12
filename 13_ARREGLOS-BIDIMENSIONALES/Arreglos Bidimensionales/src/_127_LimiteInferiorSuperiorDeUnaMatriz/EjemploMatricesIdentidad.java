public class EjemploMatricesIdentidad {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];  // Crear una matriz de tamaño 5x5

        // Llenar la matriz con elementos de la identidad
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    matriz[i][j] = 1;  // Asignar 1 en la posición (i, j) si i es igual a j
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
