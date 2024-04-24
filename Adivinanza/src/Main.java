import java.util.Scanner;
import java.util.Random;

public class adivinanza {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 0 y 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); // El límite superior (101) es exclusivo

        // Inicializar el Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable para contar los intentos
        int intentos = 0;

        System.out.println("Bienvenido al juego de adivinanzas. Adivina el número entre 0 y 100.");

        // Bucle para controlar los intentos
        while (intentos < 5) {
            System.out.print("Intento #" + (intentos + 1) + ": Ingresa tu número: ");
            int numeroUsuario = scanner.nextInt();
            intentos++;

            // Verificar si el número del usuario es igual al número aleatorio
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número " + numeroAleatorio + " en " + intentos + " intentos.");
                break; // Salir del bucle si se adivina el número
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número ingresado es menor que el número a adivinar.");
            } else {
                System.out.println("El número ingresado es mayor que el número a adivinar.");
            }
        }

        // Si el usuario no adivina en 5 intentos, mostrar el número correcto
        if (intentos == 5) {
            System.out.println("¡Lo siento! Has agotado tus intentos. El número correcto era " + numeroAleatorio + ".");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}