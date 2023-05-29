import java.util.Scanner;
    public class EjerPro3Cuatro{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Ingrese un año");
            int anio = input.nextInt();

            while(anio <= 0 || anio > 2023){
                System.out.println("Ingrese un año que si sea valido");
                anio = input.nextInt();
            }
            
            if (anio % 4 == 0 && anio % 100 != 0) {
                System.out.println("El año es bisiesto");
            }
            else if(anio % 400 == 0){
                System.out.println("El año es bisiesto");
            }
            else{
                System.out.println("El año no es bisiesto");
            }
        }
    }
