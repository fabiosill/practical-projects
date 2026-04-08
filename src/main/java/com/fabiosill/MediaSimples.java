package com.fabiosill;
import java.util.Scanner;

public class MediaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println("Média: " + media);
    }
}
