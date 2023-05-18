import java.util.Scanner;
public class EjercicioUno{
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }

}