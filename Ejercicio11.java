import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número de sueldos: ");
        int n = input.nextInt();

        while (n <= 0) { //valido que el numero de sueldos sea mayor que cero.
            System.out.print("El número de sueldos debe ser mayor que cero. Intente nuevamente.");
            System.out.println("Ingrese el número de sueldos: ");
            n = input.nextInt();
        }

        int sueldoMaximo = 0; //Lo declaro e inicializo en 0 para que vaya guardando en la misma variable. 

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el sueldo #" + i + ": ");
            int sueldo = input.nextInt();

            while (sueldo <= 0) { // valido que no se ingrese un sueldo menor o igual a 0
                System.out.print("El sueldo no puede ser menor o igual 0. Intente nuevamente.");
                System.out.println("Ingrese el sueldo #" + i + ": ");
                sueldo = input.nextInt();
            }

            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }

        System.out.println("El sueldo máximo es: " + sueldoMaximo);
    }
}

