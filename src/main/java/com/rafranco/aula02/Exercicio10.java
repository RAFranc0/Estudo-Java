package com.rafranco.aula02;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int centavos;

        int[] moedas = {100, 50, 25, 10, 5, 1};
        int cem, cinquenta, vintecinco, dez, cinco, um;

        System.out.print("Digite o valor a ser trocado em centavos: ");
        centavos = input.nextInt();

        while(centavos > 0)
        {
            for (int moeda : moedas) {
                while (centavos >= moeda) {
                    centavos -= moeda;
                }
            }
        }
    }
}
