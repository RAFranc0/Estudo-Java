package com.rafranco.aula02;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[5];
        int somaPares = 0, somaImpares = 0;

        System.out.println("Adicione 5 valores ao vetorA");

        for(int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("Digite o %dº valor: ", i + 1);
            vetorA[i] = input.nextInt();
        }

        for(int i : vetorA)
        {
            if (i % 2 == 0)
            {
                somaPares += i;
            }
            else
            {
                somaImpares += i;
            }
        }

        System.out.printf("\nSoma dos valores par: %d", somaPares);
        System.out.printf("\nSoma dos valores impar: %d", somaImpares);
    }
}
