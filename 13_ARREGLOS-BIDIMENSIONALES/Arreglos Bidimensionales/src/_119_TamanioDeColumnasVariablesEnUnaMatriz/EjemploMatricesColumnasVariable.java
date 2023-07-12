public class EjemploMatricesColumnasVariable {
    public static void main(String[] args) {

        // Declarar una matriz con 3 filas y columnas variables
        int[][] matriz = new int[3][];

        // Asignar tamaño a las columnas de cada fila
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        // Imprimir la longitud de la matriz y de cada fila
        System.out.println("matriz length: " + matriz.length);
        System.out.println("fila 0 length: " + matriz[0].length);
        System.out.println("fila 1 length: " + matriz[1].length);
        System.out.println("fila 2 length: " + matriz[2].length);

        // Asignar valores a los elementos de la matriz
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i * j;
            }
        }

        // Imprimir la matriz
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
