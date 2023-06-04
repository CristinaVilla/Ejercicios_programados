import java.util.Random;
import java.util.Scanner;

public class Progra4Tres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(20) + 1; // Genera un número aleatorio entre 1 y 20
        int intentos = 0;
        int numeroUsuario;


        System.out.println("*******************BIENVENIDO AL JUEGO DE ADIVINAR**************");
        System.out.println("Adivina el número generado (entre 1 y 20).");

        do {
            System.out.println("Ingresa un número: ");
            numeroUsuario = input.nextInt();

            while (numeroUsuario < 1){
                System.out.println("Ingresa otro numero, el que ingreso no es valido");
                numeroUsuario = input.nextInt();
            }
            if (numeroUsuario > numeroAdivinar) {
                System.out.println("El numero a adivinar es menor");
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El numero a adivinar es mayor");
            }

            intentos++;
        } while (numeroUsuario != numeroAdivinar);

        System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
    }
}
