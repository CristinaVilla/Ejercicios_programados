import java.util.Scanner;

public class Progra4Seis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidadSalarios = 10;
        int sumaSalarios = 0;
        int contadorMayores10000 = 0;

        System.out.println("Ingrese 10 salarios:");

        for (int i = 1; i <= cantidadSalarios; i++) {
            System.out.println("Salario " + i + ": ");
            int salario = input.nextInt();

            sumaSalarios += salario;

            if (salario > 10000) {
                contadorMayores10000++;
            }
        }

        System.out.println("La suma de los salarios es: " + sumaSalarios);
        System.out.println("Hay " + contadorMayores10000 + " salarios mayores a 10000 colones.");
    }
}
