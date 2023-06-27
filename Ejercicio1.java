import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        int numero = scanner.nextInt();

        if(numero > 0){
            System.out.println("Es Positivo");
        }else if(numero < 0){
            System.out.println("Es Negativo");
        }else{
            System.out.println("El numero es cero");
        }

        scanner.close();

    }

}
