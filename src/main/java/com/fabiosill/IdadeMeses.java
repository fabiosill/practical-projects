package com.fabiosill;
import java.util.Scanner;

public class IdadeMeses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade em anos: ");
        int anos = sc.nextInt();
        int meses = anos * 12;
        System.out.println("Idade em meses: " + meses);
    }
}
