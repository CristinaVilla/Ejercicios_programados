import java.util.Scanner;
public class EjerProgra3Uno {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Ingrese el primer numero : ");
    int n1 = input.nextInt();

    while( n1 == 0 ){
        System.out.println("Ingrese nuevamente el primer numero porque ingreso el 0");
        n1 = input.nextInt();
    }

    System.out.println("Ingrese el segundo numero : ");
    int n2 = input.nextInt();

    while( n2 == 0 ){
        System.out.println("Ingrese nuevamente el segundo numero porque ingreso el 0");
        n2 = input.nextInt();
    }
      
        if(n1 == n2){
            System.out.println("Los numeros ingresados son iguales");
        }
        else{
            System.out.println("Los numeros ingresados son diferentes");
        }

    }
    
}
