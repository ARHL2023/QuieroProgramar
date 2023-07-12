public class EjemploMatricesSumar {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] b = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        int[][] suma = new int[3][3];  // Declarar matriz suma con dimensiones 3x3

        // Sumar los elementos correspondientes de las matrices a y b y guardar el resultado en la matriz suma
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                suma[i][j] = a[i][j] + b[i][j];  // Sumar elementos correspondientes de a y b y guardar el resultado en suma
            }
        }

        // Imprimir la matriz suma
        for(int i = 0; i < suma.length; i++){
            for(int j = 0; j < suma[i].length; j++){
                System.out.print(suma[i][j] + "\t");  // Imprimir el valor del elemento seguido de una tabulación
            }
            System.out.println();  // Imprimir una nueva línea después de cada fila
        }
    }
}
