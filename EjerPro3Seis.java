import java.util.Scanner;

public class EjerPro3Seis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la hora : ");
        int H = input.nextInt();

        System.out.println("Ingrese los minutos : ");
        int M = input.nextInt();

        System.out.println("Ingrese los segundos : ");
        int S = input.nextInt();

        if (validarHora(H, M, S)) {
            System.out.println("La hora ingresada es válida.");
        } else {
            System.out.println("La hora ingresada no es válida.");
        }
    }

    public static boolean validarHora(int hora, int minutos, int segundos) {
        boolean esHoraValida = true;

        if (hora < 0 || hora > 23) {
            esHoraValida = false;
        }

        if (minutos < 0 || minutos > 59) {
            esHoraValida = false;
        }

        if (segundos < 0 || segundos > 59) {
            esHoraValida = false;
        }

        return esHoraValida;
    }
}
