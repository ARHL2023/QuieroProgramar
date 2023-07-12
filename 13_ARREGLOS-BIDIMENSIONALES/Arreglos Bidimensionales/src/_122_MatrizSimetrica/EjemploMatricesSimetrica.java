public class EjemploMatricesSimetrica {
    public static void main(String[] args) {
        // Variable para controlar si la matriz es simétrica
        boolean simetrica = true;

        // Declarar y definir una matriz
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        // Bucle para verificar la simetría de la matriz
        salir: for(int i = 0; i < matriz.length; i++){

            for(int j = 0;j < i; j++){
                // Comprobar si los elementos son diferentes en la simetría opuesta
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break salir; // Salir del bucle etiquetado si no es simétrica
                }
            }
        }

        // Imprimir el resultado de la verificación de simetría
        if(simetrica){
            System.out.println("La matriz es simétrica");
        } else{
            System.out.println("La matriz no es simétrica");
        }
    }
}
