package elseif;

import java.util.Scanner;

public class AprovacaoAluno {
    public static void main(String[] args){
        double n1,n2,n3,media = 0;
        double frequencia=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = sc.nextDouble();
        System.out.println("Digite sua frequência: ");
        frequencia = sc.nextDouble();

        media = (n1+n2+n3)/3;
        System.out.println("Sua média é: " + media);

        if (media >= 50 && frequencia >= 75) {
            System.out.println("Você foi aprovado");
        }
        else{
            System.out.println("Você foi reprovado");
        }
    }
}
