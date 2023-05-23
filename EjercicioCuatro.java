import java.util.Scanner;
public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número entero: ");
        int Prinumero = scanner.nextInt();

         while(Prinumero <= 0 ){
            System.out.println("Ingrese nuevamento el primer numero: ");
            Prinumero= scanner.nextInt();
        }

        System.out.println("Ingresa el segundo número entero: ");
        int Segunumero = scanner.nextInt();

        while(Segunumero <= 0 ){
            System.out.println("Ingrese nuevamente el segundo numero ");
            Segunumero= scanner.nextInt();
        }

        int suma = Prinumero + Segunumero;
        int resta = Prinumero - Segunumero;
        int division = Prinumero / Segunumero;
        int multiplicacion = Prinumero * Segunumero;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La división es: " + division);
        System.out.println("La multiplicación es: " + multiplicacion);

        scanner.close();
    }
}