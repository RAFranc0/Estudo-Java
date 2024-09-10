package com.rafranco.aula02;

import java.util.Scanner;

public class Exercicio2_iterativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor que deseja descobrir o fatorial: ");

        int n = input.nextInt(), fatorial;
        fatorial = n;

        if (n != 0) {

            while (n > 1) {
                fatorial *= n - 1;
                n--;
            }

        } else {
            fatorial = 1;
        }

        System.out.printf("Fatorial: %d", fatorial);
    }
}
