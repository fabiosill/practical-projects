package elseif;
import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número inteiro");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negativo");
        }
    }
}
