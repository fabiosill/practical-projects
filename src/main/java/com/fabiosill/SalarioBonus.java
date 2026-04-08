package com.fabiosill;
import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        double salarioFinal = salario + (salario * 0.10);
        System.out.println("Salário final: " + salarioFinal);
    }
}
