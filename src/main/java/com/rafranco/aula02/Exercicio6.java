package com.rafranco.aula02;

import com.rafranco.utils.PrintUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        System.out.println("Vamos adicionar valores aos vetores.");
        System.out.println("Primeiro o vetorA:");

        for(int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vetorA[i] = input.nextInt();
        }

        System.out.println("\nAgora o vetorB:");

        for(int i = 0; i < vetorB.length; i++)
        {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vetorB[i] = input.nextInt();
        }

        for(int i = 0; i < vetorC.length; i++)
        {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.printf("\nVetorC: %s\n", Arrays.toString(vetorC));
        PrintUtils.printSameLine(vetorC);

    }
}
