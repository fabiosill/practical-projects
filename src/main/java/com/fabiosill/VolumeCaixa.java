package com.fabiosill;
import java.util.Scanner;

public class VolumeCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o comprimento: ");
        double c = sc.nextDouble();
        System.out.print("Digite a largura: ");
        double l = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double a = sc.nextDouble();
        double volume = c * l * a;
        System.out.println("Volume: " + volume);
    }
}
