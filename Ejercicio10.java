import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suma = 0;

        System.out.println("Ingrese 15 números:");

        
        for (int i = 1; i <= 15; i++) {
            System.out.print("Número " + i + ": ");
            int numero = input.nextInt();

            while(numero < 1){
                System.out.println("Ingrese un numero entero positivo");
                numero = input.nextInt();
            }
           

            suma += numero;
        }

        System.out.println("La suma total es: " + suma);
    }
}
