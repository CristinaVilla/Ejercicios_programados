import java.util.Scanner;
public class EjerPro3Cinco {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

       
        double millas = 1;
        double kilometros = 0;

        while(millas != 0){
            System.out.println("Ingrese la cantidad de millas o cero para salir");
            millas = input.nextInt();
           if(millas < 0){
            System.out.println("Ingrese una cantidad de millas que si sea valida");
            millas = input.nextInt();
           } 
           kilometros = millas * 1.6093;
           System.out.println("Las millas ingresadas fueron " + millas + " en kilometros es " + kilometros);

        }
        
        
    }

    
}
