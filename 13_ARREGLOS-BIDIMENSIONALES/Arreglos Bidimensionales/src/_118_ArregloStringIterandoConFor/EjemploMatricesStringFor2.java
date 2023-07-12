public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        // Crear una matriz de tipo String e inicializarla con los valores proporcionados
        String[][] nombres = { {"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"}};

        // Iterar sobre la matriz utilizando un bucle "foreach"
        for(String[] fila: nombres){  // Itera sobre cada fila de la matriz
            for(String nombre: fila){  // Itera sobre cada elemento de la fila actual
                System.out.print(nombre + "\t");  // Imprime el nombre actual seguido de una tabulación
            }
            System.out.println();  // Imprime una nueva línea después de imprimir todos los elementos de la fila
        }
    }
}
