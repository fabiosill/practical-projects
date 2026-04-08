package com.fabiosill;
import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a distância (km): ");
        double distancia = sc.nextDouble();
        System.out.print("Digite o combustível (litros): ");
        double litros = sc.nextDouble();
        double consumo = distancia / litros;
        System.out.println("Consumo médio: " + consumo + " km/l");
    }
}