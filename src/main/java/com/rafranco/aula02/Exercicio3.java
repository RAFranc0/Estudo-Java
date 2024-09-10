package com.rafranco.aula02;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor para começar: ");
        int valor = input.nextInt();

        while (valor > 1) {
            if (valor % 2 == 0) {
                valor /= 2;
                System.out.printf("%d ", valor);
            } else {
                valor = (valor * 3) + 1;
                System.out.printf("%d ", valor);
            }
        }
    }
}
