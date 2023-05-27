import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el dia: ");
        int dia = input.nextInt();

        System.out.println("Ingrese el mes: ");
        int mes = input.nextInt();
        
        System.out.println("Ingrese el año : ");
        int anio = input.nextInt();

        if(dia < 1 && dia > 30){
            System.out.println("La fecha es incorrecta");
        }
        else if(mes < 1 && mes > 12){
            System.out.println("La fecha es incorrecta");
        }
        else if(anio > 2023){
            System.out.println("La fecha es incorrecta");
        }
        else{
            System.out.println("La fecha es correcta");
        }

    }
}

