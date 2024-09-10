package com.rafranco.aula02;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Exercício 1: Leia cinco números inteiros e imprima o maior e o menor números. Cada número da entrada deve ser lido após pressionar 'Enter'.");

        Scanner input = new Scanner(System.in);

        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite um número inteiro:");
            valores[i] = input.nextInt();
        }

        int maiorValor = valores[0], menorValor = valores[0];

        //Utilizando a iteração

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
            } else if (valores[i] < maiorValor) {
                menorValor = valores[i];
            }
        }

/* Utilizando o Math.max e Math.min
        for(int max : valores)
        {
            maior = Math.max(maior, max);
        }

        for(int min : valores)
        {
            menor = Math.min(menor, min);
        }*/

        System.out.printf("Maior: %d || Menor: %d", maiorValor, menorValor);

    }
}
