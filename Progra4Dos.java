import java.util.Scanner;

public class Progra4Dos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;

        System.out.println("Introduce números (introduce un número negativo para terminar):");

        while (true) {
            int numero = input.nextInt();

            if (numero < 0) {
                break;
            }

            contador++;
        }

        System.out.println("Se han introducido " + contador + " números.");
    }
}