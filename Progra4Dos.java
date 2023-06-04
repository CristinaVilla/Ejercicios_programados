import java.util.Scanner;

public class Progra4Dos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;
        int numero;

        do{
            System.out.println("Digite un numero (o digite un numero negativo para terminar): ");
            numero = input.nextInt();
            contador++;
        } while (numero >= 0);


        System.out.println("Se han introducido " + contador + " números.");
    }
}