package ExerciciosJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int idade;
        int qtdMaiores=0,qtdMenores=0;
        int somaIdades = 0;
        double media = 0;
        int qtdAlunos = 5;

        for (int i=1; i<=qtdAlunos;i++){
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            if (idade >=18){
                System.out.println("Maior de idade");
                qtdMaiores = qtdMaiores + 1;
            }
            else
            {
                System.out.println("Menor de Idade");
                //contador
                qtdMenores = qtdMenores + 1;
            }
            //acumulador
            somaIdades = somaIdades + idade;
            //calculo da media
            media = somaIdades / qtdAlunos;
        }
        //exibição dos valores:
        System.out.println("**Resultados**");
        System.out.println("Qtd. de alunos maiores de idade: "+qtdMaiores);
        System.out.println("Qtd. de alunos menores de idade: "+qtdMenores);
        System.out.println("Média de idade dos alunos: "+media);
    }
}

