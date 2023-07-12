public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        // Declarar y inicializar una matriz de enteros
        int[][] matrizDeEnteros = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        // Elemento a buscar en la matriz
        int elementoBuscar = 1999;

        // Variables para controlar si se encontró el elemento
        boolean encontrado = false;
        int i;
        int j = 0;

        // Bucle etiquetado para buscar el elemento en la matriz
        buscar: for(i = 0; i < matrizDeEnteros.length; i++){
            for(j = 0; j < matrizDeEnteros[i].length; j++){
                if(matrizDeEnteros[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar; // Salir del bucle etiquetado si se encuentra el elemento
                }
            }
        }

        // Verificar si el elemento fue encontrado
        if(encontrado){
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + "," + j);
        } else {
            System.out.println(elementoBuscar + " no se encontró en la matriz!");
        }
    }
}
