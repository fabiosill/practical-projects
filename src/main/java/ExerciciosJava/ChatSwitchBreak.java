package ExerciciosJava;

import java.util.Scanner;

public class ChatSwitchBreak {
    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("* * Clinica Dr. Pimpolho * *");
            System.out.println("1. Agendar Exames");
            System.out.println("2. Re-agendar Exames");
            System.out.println("3. Cancelar Exames");
            System.out.println("4. Resultados de  Exames");
            System.out.println("5. Sair");
            System.out.println("Digite a opcao desejada: ");
            opcao = sc.nextInt();

            switch (opcao)
            {
                case 1:
                {
                    System.out.println("Escolha a data para qual quer agendar seu exame!");
                    break;
                }
                case 2:
                    System.out.println("Para qual data quer reagendar ? ");
                    break;
                case 3:
                    System.out.println("Qual exame quer cancelar ?");
                    break;
                case 4:
                    System.out.println("Selecione os exames que vc quer o resultado");
                    break;
                case 5:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }while (opcao !=5);


    }
}