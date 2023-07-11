import java.util.Random;

public class JuegoDeAmor {
    public static void main(String[] args) {
        String novia = "Lady";
        int amor = generarAmor();
        mostrarBarraDeAmor(novia, amor);
        mostrarMensaje(amor);
    }

    public static int generarAmor() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void mostrarBarraDeAmor(String nombre, int nivelAmor) {
        System.out.println("Nivel de amor de " + nombre + ": " + nivelAmor);
        System.out.println("----------------------------");
        System.out.print("|");
        for (int i = 0; i < nivelAmor; i++) {
            System.out.print("=");
        }
        System.out.println("|");
        System.out.println("----------------------------");
    }

    public static void mostrarMensaje(int nivelAmor) {
        String mensaje;
        if (nivelAmor <= 30) {
            mensaje = "¡Necesitas trabajar en tu relación!";
        } else if (nivelAmor <= 70) {
            mensaje = "¡Hay amor, pero aún se puede mejorar!";
        } else {
            mensaje = "¡Estás profundamente enamorado!";
        }

        System.out.println("Mensaje: " + mensaje);
    }
}
