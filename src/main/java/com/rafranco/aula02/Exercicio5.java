package com.rafranco.aula02;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] temperaturas = new int[7];
        enum Dias {SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO}
        int soma = 0, media = 0;

        System.out.println("Digite as temperaturas registradas essa semana, começando na segunda-feira:");

        for (int i = 0; i < temperaturas.length; i++)
        {
            System.out.print(Dias.values()[i] + ": ");
            temperaturas[i] = input.nextInt();
            soma += temperaturas[i];
        }

        media = soma / Dias.values().length;

        System.out.println("\nA média de temperatura foi " + media +"º. Abaixo os dias que ultrapassaram essa média:");

        for(int i = 0; i < temperaturas.length; i++)
        {
            if (temperaturas[i] > media)
            {
                System.out.println(Dias.values()[i] + ": " + temperaturas[i]);
            }
        }
    }
}
