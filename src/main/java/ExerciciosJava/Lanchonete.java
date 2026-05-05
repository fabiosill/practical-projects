package ExerciciosJava;

import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int opcao = 0;
        double total = 0;
        int qtdItens = 0;
        boolean desconto = false;
        int pedido = 1;

        while (opcao !=6){
            System.out.println("\n MENU DA LANCHONETE .NET ");
            System.out.println("1. Hamburguer - R$ 20,00");
            System.out.println("2. Mini Pizza - R$ 15,00");
            System.out.println("3. Refri      - R$  5,00");
            System.out.println("4. Ver total");
            System.out.println("5. Novo Pedido");
            System.out.println("6. Sair");
            System.out.println("Digite sua opcao: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:{
                    System.out.println("Hambuguer adicionado ao pedido! ");
                    qtdItens = qtdItens + 1; // contador
                    total = total + 20;
                    break;
                }
                case 2:{
                    System.out.println("Mini Pizza adicionado ao pedido! ");
                    qtdItens = qtdItens + 1; // contador
                    total = total + 15;
                    break;
                }
                case 3:{
                    System.out.println("Refri adicionado ao pedido! ");
                    qtdItens = qtdItens + 1; // contador
                    total = total + 5;
                    break;
                }
                case 4:
                {
                    if (desconto == false){
                        if (total > 30){
                            System.out.println("Voce gastou mais que R$ 30,00 ganhou desconto de R$ 5,00");
                            total = total - 5;
                            desconto = true;
                        }
                    }
                    System.out.println("Pedido numero: "+pedido);
                    System.out.println("Qtd de itens do pedido: "+qtdItens);
                    System.out.println("Total do pedido: "+total);
                    break;

                }
                case 5:
                {
                    //zera as variáveis, ou melhor, reseta as variáveis
                    //exceto a variável pedido, que é incrementada
                    pedido = pedido + 1;
                    total = 0;
                    qtdItens = 0;
                    desconto = false;
                    break;
                }


                case 6:
                {
                    System.out.println("Ate logo!");
                    break;
                }
                default:
                {
                    System.out.println("Opcao invalida!");
                }

            }


        }




    }
}