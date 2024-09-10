package com.rafranco.aula02;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Exercício 1: Leia cinco números inteiros e imprima o maior e o menor números. Cada número da entrada deve ser lido após pressionar 'Enter'.");

        Scanner input = new Scanner(System.in);

        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++)
        {
            System.out.println("Digite um número inteiro:");
            valores[i] = input.nextInt();
        }

        int maior = valores[0], menor = valores[0];

        for(int max : valores)
        {
            maior = Math.max(maior, max);
        }

        for(int min : valores)
        {
            menor = Math.min(menor, min);
        }

        System.out.printf("Maior: %d || Menor: %d", maior, menor);

    }
}
