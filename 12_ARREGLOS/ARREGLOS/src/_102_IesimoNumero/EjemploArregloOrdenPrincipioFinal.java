package _102_IesimoNumero;

public class EjemploArregloOrdenPrincipioFinal {
    public static void main(String[] args) {

        int numeros[] = new int[10]; // Crear un arreglo llamado "numeros" con capacidad para 10 elementos
        int a[] = new int[10]; // Crear un arreglo llamado "a" con capacidad para 10 elementos

        // Llenar el arreglo "numeros" con valores del 1 al 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        int aux = 0;
        // Recorrer el arreglo "numeros" de forma iterativa
        // y copiar sus elementos en el arreglo "a" de manera alternada
        for (int i = 0; i < numeros.length - i; i++) {
            a[aux++] = numeros[i]; // Copiar el i-ésimo elemento de "numeros" en "a"
            a[aux++] = numeros[numeros.length - 1 - i]; // Copiar el elemento opuesto de "numeros" en "a"
        }

        // Imprimir el contenido del arreglo "a" en la consola
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + " valor = " + a[i]);
        }
    }
}
