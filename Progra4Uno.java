import java.util.Scanner;

public class Progra4Uno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número positivo (o un número negativo para salir): ");
            numero = input.nextInt();

            if (numero > 0) {
                int cuadrado = numero * numero;
                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            } else if (numero == 0) {
                System.out.println("No se permite ingresar el número 0. Intenta nuevamente.");
            }
        } while (numero > 0);

        System.out.println("Programa finalizado.");
    }
}
