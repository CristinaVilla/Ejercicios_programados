import java.util.Scanner;
public class EjerPro3Dos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero entero : ");
        int nuEnt = input.nextInt();

        while(nuEnt == 0){
            System.out.println("Ingrese un numero diferente de 0 : ");
            nuEnt = input.nextInt();
        }
        int doble = nuEnt * 2;
        int triple = nuEnt *3;

        System.out.print("El numero es : " + nuEnt  ); 
        System.out.print(" el doble es  " + doble );
        System.out.print(" y el triple es  " + triple);

    }
    
}
