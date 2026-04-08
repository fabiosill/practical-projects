package com.fabiosill;
import java.util.Scanner;

public class AreaTrianguloRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a largura: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        double area = largura * altura;
        System.out.println("area: " + area);
    }
}