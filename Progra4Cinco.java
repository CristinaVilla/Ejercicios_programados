import java.util.Scanner;

public class Progra4Cinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = input.nextInt();
        while(numero < 1){
            System.out.println("Ingrese nuevamente un numero: ");
            numero = input.nextInt();
        }

        System.out.println("Números del 1 al " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}

