import java.util.Scanner;


public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7]; // Crear el arreglo "claseMatematicas" para almacenar las notas de matemáticas
        claseHistoria = new double[7]; // Crear el arreglo "claseHistoria" para almacenar las notas de historia
        claseLenguaje = new double[7]; // Crear el arreglo "claseLenguaje" para almacenar las notas de lenguaje

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para matemáticas:");
        for(int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = s.nextDouble(); // Solicitar al usuario que ingrese las notas de matemáticas y almacenarlas en el arreglo "claseMatematicas"
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia:");
        for(int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = s.nextDouble(); // Solicitar al usuario que ingrese las notas de historia y almacenarlas en el arreglo "claseHistoria"
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje:");
        for(int i  = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = s.nextDouble(); // Solicitar al usuario que ingrese las notas de lenguaje y almacenarlas en el arreglo "claseLenguaje"
        }

        // Calcular la suma de las notas de cada materia
        for(int i = 0; i < 7; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        // Calcular los promedios de cada materia y el promedio total del curso
        double promedioMatematica = (sumNotasMatematicas/claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria/claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje/claseLenguaje.length);
        System.out.println("Promedio clase matemáticas: " + promedioMatematica);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total del curso: "
                + (promedioMatematica + promedioHistoria + promedioLenguaje)/3);

        // Solicitar al usuario el identificador del alumno y calcular su promedio
        System.out.println("Ingrese el identificador del alumno (de 0 - 6):");
        int id = s.nextInt();
        double promedioAlumno = (claseHistoria[id] + claseLenguaje[id] + claseMatematicas[id])/3;
        System.out.println("Promedio alumno Nro " + id + " : " + promedioAlumno);
    }
}
