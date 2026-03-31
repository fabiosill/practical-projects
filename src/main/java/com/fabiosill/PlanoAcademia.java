package com.fabiosill;

import java.util.Scanner;

public class PlanoAcademia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nomealuno;
        String tipoplano;
        double valormensal = 0;
        int qtdmeses = 0;
        double subtotalplano = 0;
        double desconto = 0.05;
        double taxaadm = 0;
        double valorfinal = 0;
        double valormensalfinal = 0;

        System.out.println("Nome do aluno: ");
        nomealuno = sc.nextLine();
        System.out.println("Digite o tipo do plano: ");
        tipoplano = sc.nextLine();
        System.out.println("Digite o valor do plano: ");
        valormensal = sc.nextDouble();
        System.out.println("Digite quantos meses contratados: ");
        qtdmeses = sc.nextInt();

        subtotalplano = valormensal * qtdmeses;
        desconto = subtotalplano * 0.05;
        taxaadm = subtotalplano * 0.02;
        valorfinal = (subtotalplano - desconto) + taxaadm;
        valormensalfinal = valorfinal * qtdmeses;

        System.out.println("Aluno: "+nomealuno);
        System.out.println("Plano: "+tipoplano);
        System.out.println("Valor mensal: "+valorfinal);
        System.out.println("Meses contratados: "+qtdmeses);
        System.out.println("========================");
        System.out.println("Valor total: "+subtotalplano);
        System.out.println("Desconto (5%): "+desconto);
        System.out.println("Taxa administrativa (2%): "+taxaadm);
        System.out.println("Valor final: "+valorfinal);
        System.out.println("Valor mensal final: "+valormensalfinal);
    }
}


