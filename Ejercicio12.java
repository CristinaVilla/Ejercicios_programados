import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contarNegativos = 0; // defino esta variable y lo inicio en 0, luego lo utilizo

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el número #" + i + ": ");
            int nume = input.nextInt();

            // Validación de no ingresar ceros
            while (nume == 0) {
                System.out.println("No se permiten ceros. Intente nuevamente.");
                System.out.println("Ingrese el número #" + i + ": ");
                nume = input.nextInt();
            }

            // Verificar los numeros negativos
            if (nume < 0) {
                contarNegativos++;
            }
        }

        if (contarNegativos > 0) {
            System.out.println("Se ha introducido al menos un número negativo.");
        } else {
            System.out.println("No se ha introducido ningún número negativo.");
        }
    }
}
