import java.util.Scanner;
    public class QuizUno{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el numero para las filas");
    int num1 = input.nextInt();

    while(num1 < 0 ){
        System.out.println("Ingrese nuvamente el numero");
        num1 =input.nextInt();
    }

    System.out.println("Ingrese el numero para las columnas");
    int num2 = input.nextInt();

    while(num2 < 0 ){
        System.out.println("Ingrese nuvamente el numero");
        num2 = input.nextInt();
    }

    for (int i = 0; i < num1; i++) {
        for (int j = 0; j < num2; j++) {
            if (num2[j] < num1[j + 1]) {
                otro = num2[j];
                num2[j] = num2[j + 1];
                num2[j + 1] = otro;
            }
        }
    }
  }
}