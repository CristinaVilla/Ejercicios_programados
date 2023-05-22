import java.util.Scanner;
public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = calcularAreaCirculo(radio);
        double perimetro = calcularPerimetroCirculo(radio);

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);

        scanner.close();
    }
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    public static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
}