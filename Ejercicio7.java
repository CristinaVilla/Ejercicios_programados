import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero; //Aquí declaro el numero, luego lo utilizo

        do { //Uso un do-while para que todo se ejecute almenos una vez
            System.out.println("Ingrese un número positivo (o ingresa un numero negativo para finalizar): ");
            numero = input.nextInt();

            if (numero >= 0) {
                int cuadrado = numero * numero;
                System.out.println("El numero es: " + numero );
                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            } else {
                System.out.println("Usted ha ingresado un numero negativo, el programa ha finalizado.");
            }
            
        } while (numero >= 0);

        
    }
}




