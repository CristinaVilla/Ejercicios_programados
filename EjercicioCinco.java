import java.util.Scanner;
public class EjercicioCinco {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int numero = input.nextInt();
        while (numero <= 0){
            System.out.println("Nuevamente ingrese un numero entero");
            numero = input.nextInt();
        }
        int factorial = 1;

        while (numero != 0){
            factorial=factorial*numero; numero--;
        }
        System.out.println("El resultado de la factorial es: " + factorial);
    }