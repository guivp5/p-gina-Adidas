import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int i;

        System.out.println("Escolha um numero:");
        numero = scanner.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        
        scanner.close();
    }

}
