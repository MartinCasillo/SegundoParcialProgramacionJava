import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        int contador = 1;

        while (contador <= numero) {
            factorial *= contador;
            contador++;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

    }
}
