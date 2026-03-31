package com.fabiosill;

import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nomefuncionario;
        double horastrabalhadas = 0;
        double valorhora = 0;
        double vlhoraextra = 0;
        double valorcomissao = 0;
        double salariobase = 0;
        double descansoremun = 0;
        double totalproventos = 0;
        double descontoinss = 0;
        double descontoir = 0;
        double descvaletransporte = 0;
        double descontototal = 0;
        double salarioliquido =0;

        System.out.println("Nome: ");
        nomefuncionario = sc.nextLine();
        System.out.println("Horas trabalhadas: ");
        horastrabalhadas = sc.nextDouble();
        System.out.println("Valor da hora: ");
        valorhora = sc.nextDouble();
        System.out.println("Valor da hora extra: ");
        vlhoraextra = sc.nextDouble();
        System.out.println("Valor das comissões: ");
        valorcomissao = sc.nextDouble();

        salariobase = horastrabalhadas * valorhora;
        descansoremun = salariobase * 0.10;
        totalproventos = salariobase + vlhoraextra + valorcomissao + descansoremun;

        descontoinss = salariobase * 0.08;
        descontoir = salariobase * 0.05;
        descvaletransporte = salariobase * 0.06;
        descontototal = descontoinss + descontoir + descvaletransporte;
        salarioliquido = totalproventos - descontototal;

        System.out.println("Funcionário: "+nomefuncionario);
        System.out.println("Salario base: "+salariobase);
        System.out.println("DSR (10%): "+descansoremun);
        System.out.println("Horas extras: "+ vlhoraextra);
        System.out.println("Comissões: "+valorcomissao);
        System.out.println("Proventos: "+totalproventos);
        System.out.println("INSS (8%): "+descontoinss);
        System.out.println("IR (5%): "+descontoir);
        System.out.println("Vale transporte (6%): "+descvaletransporte);
        System.out.println("Total de descontos: "+descontototal);
        System.out.println("Salário líquido: "+salarioliquido);

    }
}
