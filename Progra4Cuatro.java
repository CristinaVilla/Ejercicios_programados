import java.util.Scanner;

public class Progra4Cuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los números del 100 al 0 de 7 en 7:");

        int num = 100;
        while (num >= 0) {
            System.out.print("Ingrese el número " + num + ": ");
            int numeroUsuario = input.nextInt();

            if (numeroUsuario != num) {
                System.out.println("Número incorrecto. Inténtelo de nuevo.");
                continue;
            }

            num -= 7;
        }

        System.out.println("¡Felicidades! Ingresaste todos los números correctamente.");
    }
}
