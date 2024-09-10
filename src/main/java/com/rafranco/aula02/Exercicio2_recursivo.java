package com.rafranco.aula02;

import java.util.Scanner;

public class Exercicio2_recursivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor que deseja descobrir o fatorial: ");
        int n = input.nextInt();

        System.out.printf("Fatorial: %d", Fatorial(n));
    }

    public static int Fatorial(int n) {
        int fatorial = n;

        if (n != 0) {

            while (n > 1) {
                fatorial *= n - 1;
                n--;
            }

        } else {
            fatorial = 1;
        }

        return fatorial;
    }
}
