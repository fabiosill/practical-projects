package com.fabiosill;
import java.util.Scanner;

public class HorasTrabalhadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite as horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.print("Digite o valor por hora: ");
        double valorHora = sc.nextDouble();
        double salario = horas * valorHora;
        System.out.println("Salário: " + salario);
    }
}