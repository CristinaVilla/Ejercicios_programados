import java.util.Scanner;
public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        while(numero<=0){
            System.out.println("Error ingrese otro numero que si sea entero");
            numero = scanner.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            int Producto = numero * i;
            System.out.println(numero + " x " + i + " = " + Producto);
        }
    }
}