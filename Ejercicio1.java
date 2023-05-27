import java.util.Scanner;
public class Ejercicio1.2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        while(numero == 0){
            System.out.println("Ingrese un número diferente a cero ");
            numero = scanner.nextInt();
        }
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        }
    }
}



