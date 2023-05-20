import java.util.Scanner;
public class MultiploDe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numeroOne = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numeroTwo = scanner.nextInt();

        if (Multiplos(numeroOne, numeroTwo)) {
            System.out.println(numeroOne + " es múltiplo de " + numeroTwo);
        } else if (Multiplos(numeroTwo, numeroOne)) {
            System.out.println(numeroTwo + " es múltiplo de " + numeroOne);
        } else {
            System.out.println("Error no son múltiplos entre sí.");
        }
    }
    public static boolean Multiplos(int numeroOne, int numeroTwo) {
        return numeroOne % numeroTwo == 0;
    }
}






