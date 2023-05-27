import java.util.Scanner;
public class NumMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int primer = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int segundo = scanner.nextInt();

        int mayor = MayorEs(primer, segundo);

        System.out.println("El número mayor es: " + mayor);

        while ()
    }
    public static int MayorEs(int primernu, int segundonu) {
        if (primernu > segundonu) {
            return primernu;
        } else {
            return segundonu;
        }
    }
}