import java.util.Scanner;

public class QuizUno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número de filas: ");
        int filas = input.nextInt();

        System.out.println("Ingrese el número de columnas: ");
        int columnas = input.nextInt();

        String[][] matriz = new String[filas][columnas];

        System.out.println("Ingrese su nombre en cada posición de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el nombre en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = input.next();
            }
        }

        System.out.println("Matriz ingresada:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}