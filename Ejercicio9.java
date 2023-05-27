import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int suma = 0;

        do {
            System.out.println("Ingrese un número (0 para salir): ");
            numero = input.nextInt();

            if (numero != 0) {
                suma += numero; //El signo += es para asignar el valor de la derecha a la variable de la izquierda
            }
        } while (numero != 0);

        System.out.println("La suma de los números introducidos es: " + suma);
    }
}