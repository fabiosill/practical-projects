package ExerciciosJava;

import java.util.Scanner;

public class Repeticao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,soma=0,media=0,qtd=0;

        do
        {
            System.out.println("Digite um numero (zero para sair): ");
            numero = sc.nextInt();
            soma = soma + numero; // soma+=numero;
            if (numero !=0 ){
                qtd = qtd + 1; // qtd++;
            }


        }while(numero!=0);
        media = soma / qtd;
        System.out.println("Fim do while!");
        System.out.println("O total digitado e: "+soma);
        System.out.println("A qtd de numeros digitados eh: "+qtd);
        System.out.println("A media eh: "+media);
    }
}
