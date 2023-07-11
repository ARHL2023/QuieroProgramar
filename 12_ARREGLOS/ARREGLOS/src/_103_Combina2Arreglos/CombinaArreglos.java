package _103_Combina2Arreglos;

public class CombinaArreglos {
    public static void main(String[] args) {

        int [] a, b, c; // Declarar tres arreglos: "a", "b" y "c"

        a = new int[10]; // Crear el arreglo "a" con capacidad para 10 elementos
        b = new int[10]; // Crear el arreglo "b" con capacidad para 10 elementos
        c = new int[20]; // Crear el arreglo "c" con capacidad para 20 elementos

        // Llenar el arreglo "a" con valores del 1 al 10
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        // Llenar el arreglo "b" con valores del 5 al 50, incrementando de 5 en 5
        for (int i = 0; i < a.length; i++) {
            b[i] = (i + 1) * 5;
        }

        int aux = 0;
        // Combinar los arreglos "a" y "b" en el arreglo "c" de forma alternada
        for (int i = 0; i < 10; i++) {
            c[aux++] = a[i]; // Copiar el i-ésimo elemento de "a" en "c"
            c[aux++] = b[i]; // Copiar el i-ésimo elemento de "b" en "c"
        }

        // Imprimir el contenido del arreglo "c" en la consola
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + " : " + c[i]);
        }
    }
}
