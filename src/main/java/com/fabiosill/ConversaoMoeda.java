package com.fabiosill;
import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor em reais: ");
        double reais = sc.nextDouble();
        double dolares = reais / 5.0;
        System.out.println("Valor em dólares: " + dolares);
    }
}
