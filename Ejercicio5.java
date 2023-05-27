import java.util.Scanner;
    public class Ejercicio5{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese un numero de 0 a 9999");
    int num = input.nextInt();
        while(num < 0 || num > 9999){
          System.out.println("Ingrese un numero de 0 a 9999");
           num = input.nextInt();
        }
        if(num < 10){
            System.out.println("El numero tiene una cifra");
        }
        else if(num >= 10 && num < 100){
            System.out.println("El numero tiene dos cifras");
        }
        else if(num >= 100 && num < 1000){
            System.out.println("El numero tiene tres cifras");
        }
        else if (num >= 1000 && num < 10000){
             System.out.println("El numero tiene cuatro cifras");
        }
        else{}     
    }  
}