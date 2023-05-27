import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num; //Defino el numero

        do { // Lo utilizo para que se ejecute almenos una vezm
            System.out.println("Ingrese un número (o 0 para salir): ");
            num = input.nextInt();

            if (num > 0) {
                System.out.println("El número es positivo.");
            } else if (num < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("Ingresaste el 0 el programa ha finalizado.");
            }
        } while (num != 0);
    }
}
