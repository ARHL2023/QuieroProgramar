package _104_Combina2ArrreglosEnUnTerceroConMultiplesElementos;

public class CombinaArreglos {
    public static void main(String[] args) {

        int[] a, b, c;

        a = new int[12]; // Crear el arreglo "a" con capacidad para 12 elementos
        b = new int[12]; // Crear el arreglo "b" con capacidad para 12 elementos
        c = new int[24]; // Crear el arreglo "c" con capacidad para 24 elementos

        // Llenar el arreglo "a" con valores del 1 al 12
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        // Llenar el arreglo "b" con valores del 5 al 60, incrementando de 5 en 5
        for (int i = 0; i < a.length; i++) {
            b[i] = (i + 1) * 5;
        }

        int aux = 0;
        // Combinar los arreglos "a" y "b" en el arreglo "c" en bloques de 3 elementos
        for (int i = 0; i < b.length; i += 3) {
            // Copiar 3 elementos de "a" al arreglo "c"
            for (int j = 0; j < 3; j++) {
                c[aux++] = a[i + j];
            }
            // Copiar 3 elementos de "b" al arreglo "c"
            for (int j = 0; j < 3; j++) {
                c[aux++] = b[i + j];
            }
        }

        // Imprimir el contenido del arreglo "c" en la consola
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + " : " + c[i]);
        }
    }
}
