import java.util.Scanner;

public class Progra4Uno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero;

        do {
            System.out.println("Ingresa un número positivo (o un número negativo para salir): ");
            numero = input.nextInt();

            double cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
               
        } while (numero >= 1);

        System.out.println("Programa finalizado.");
    }
}

