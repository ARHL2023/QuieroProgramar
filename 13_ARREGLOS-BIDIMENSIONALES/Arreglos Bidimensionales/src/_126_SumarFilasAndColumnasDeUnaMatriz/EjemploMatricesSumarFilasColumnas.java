public class EjemploMatricesSumarFilasColumnas {
    public static void main(String[] args) {
        int sumaFila, sumaColumna;  // Variables para almacenar la suma de cada fila y columna
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i = 0; i < a.length; i++){
            sumaColumna = 0;  // Reiniciar la suma de la columna en cada iteración del bucle externo
            sumaFila = 0;  // Reiniciar la suma de la fila en cada iteración del bucle externo
            for(int j = 0; j < a[i].length; j++){
                sumaFila += a[i][j];  // Sumar los elementos de la fila i y guardar el resultado en sumaFila
                sumaColumna += a[j][i];  // Sumar los elementos de la columna i y guardar el resultado en sumaColumna
            }
            System.out.println("Total fila " + i + ": " + sumaFila);  // Imprimir la suma de la fila i
            System.out.println("Total columna " + i + ": " + sumaColumna);  // Imprimir la suma de la columna i
        }

    }
}
