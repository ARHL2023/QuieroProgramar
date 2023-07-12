public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        // Crear una matriz de tipo String de tamaño 3x2
        String[][] nombres = new String[3][2];

        // Asignar valores a los elementos de la matriz
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Josefa";
        nombres[1][1] = "Paco";
        nombres[2][0] = "Lucas";
        nombres[2][1] = "Pancha";

        // Iterar sobre la matriz utilizando un bucle "for"
        System.out.println("Iterando con for:");
        for(int i = 0; i < nombres.length; i++){
            for(int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        // Iterar sobre la matriz utilizando un bucle "foreach"
        System.out.println("Iterando con foreach:");
        for(String[] fila: nombres){
            for(String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
