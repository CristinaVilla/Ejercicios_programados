import java.util.Scanner;
public class DeMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        int[] numOrdenados = ordenarNum(numero1, numero2, numero3);

        System.out.println("Los números ordenados de mayor a menor son:");
        for (int numero : numOrdenados) {
            System.out.println(numero);
        }
    }
    /*La función ordenarNum recibe tres números como argumentos (numero1, numero2, numero3)
     y devuelve un arreglo ordenado en orden descendente que contiene esos tres números. 
     Utiliza el ordenamiento de burbuja (bubble sort) para ordenar los elementos
    del arreglo en orden descendente.*/
    public static int[] ordenarNum(int numero1, int numero2, int numero3) {
        int[] numeros = {numero1, numero2, numero3};
        int temp;

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        return numeros;
    }
}