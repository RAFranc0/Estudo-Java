package com.rafranco.aula02;

import java.util.Scanner;

public class Exercicio4_recursivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.println("Cálculo de Fibonacci");

        do {
            System.out.println("Digite a quantidade de termos que deseja calcular: ");
            n = input.nextInt();
        } while (n <= 2);

        Fibonacci(n);
    }

    public static void Fibonacci(int n) {
        int termoA = 0, termoB = 1;

        for (int contador = 1; contador <= n; contador++) {
            System.out.printf("%d ", termoB);

            termoB = termoB + termoA;
            termoA = termoB - termoA;
        }
    }
}
