package ExerciciosJava;
import java.util.Scanner;

public class ChatElseIf {

    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner (System.in);

        System.out.println("* * Clinica Dr. Pimpolho * *");
        System.out.println("1. Agendar Exames");
        System.out.println("2. Re-agendar Exames");
        System.out.println("3. Cancelar Exames");
        System.out.println("4. Resultados de  Exames");
        System.out.println("Digite a opcao desejada: ");
        opcao = sc.nextInt();

        if (opcao == 1){
            System.out.println("Escolha a data para qual quer agendar seu exame!");
        }
        else if (opcao == 2){
            System.out.println("Para qual data quer reagendar ? ");
        }
        else if (opcao == 3)
        {
            System.out.println("Qual exame quer cancelar ?");
        }
        else if (opcao == 4)
        {
            System.out.println("Selecione os exames que vc quer o resultado");
        }
        else
        {
            System.out.println("Opcao invalida!");
        }
    }
}