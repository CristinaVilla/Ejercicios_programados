import java.util.Scanner;
public class EjerPro3Tres {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int num = input.nextInt();

        while(num == 0){
            System.out.println("Ingrese un numero distinto de 0");
            num = input.nextInt();
        }
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("El numero " + num + " es multiplo de 3 y de 5 ");
        }
        else{
            System.out.println("El numero " + num + " no es multiplo de 3 y 5 ");
        }
    }
}
