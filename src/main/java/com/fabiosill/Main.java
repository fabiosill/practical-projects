package com.fabiosill;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String descricao;
        int quantidade = 0;
        double valorEmDolar = 0;
        double subTotalUS = 0;
        double subTotalReal = 0;
        double cotacaoDolar = 5.24;

        System.out.println("Digite a descrição do produto: ");
        descricao = sc.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        quantidade = sc.nextInt();
        System.out.println("Digite o valor em US$: ");
        valorEmDolar = sc.nextInt();

        subTotalUS = valorEmDolar*quantidade;
        subTotalReal = (valorEmDolar * cotacaoDolar) * quantidade;

        System.out.println("Subtotal em US$: "+subTotalUS);
        System.out.println("Subtotal em R$: "+subTotalReal);

    }
}