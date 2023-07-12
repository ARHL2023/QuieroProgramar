public class EjemploMatricesTransponerMatriz {
    public static void main(String[] args) {

        int[][] a, b;
        a = new int[8][4];  // Declarar matriz a con dimensiones 8x4
        b = new int[4][8];  // Declarar matriz b con dimensiones 4x8

        // Llenar la matriz a e imprimir sus elementos
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = i+j*3;  // Asignar valor a cada elemento de la matriz a
                System.out.print(a[i][j] + "\t");  // Imprimir el valor del elemento seguido de una tabulación
            }
            System.out.println();  // Imprimir una nueva línea después de cada fila
        }

        // Transponer la matriz a y guardarla en la matriz b
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                b[j][i] = a[i][j];  // Intercambiar elementos entre la fila i y la columna j
            }
        }

        // Imprimir la matriz transpuesta b
        System.out.println("La matriz transpuesta b:");
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + "\t");  // Imprimir el valor del elemento seguido de una tabulación
            }
            System.out.println();  // Imprimir una nueva línea después de cada fila
        }
    }
}
