import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        int contadorVocales = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La cantidad de vocales en la cadena es: " + contadorVocales);

    }

}
