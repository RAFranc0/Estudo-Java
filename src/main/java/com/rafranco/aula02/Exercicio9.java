package com.rafranco.aula02;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double dinheiro, precoChocolate = 2.25;
        int embalagensDevolvidas, chocolatesQuePodeComer, chocolatesComprados;

        System.out.println("Quanto de dinheiro você possui?");
        dinheiro = input.nextDouble();

        chocolatesComprados = (int)Math.floor(dinheiro/precoChocolate) * 2;
        embalagensDevolvidas = chocolatesComprados;

        chocolatesQuePodeComer = embalagensDevolvidas + chocolatesComprados;

        System.out.println("Existe uma promoção onde, para cada embalagem de chocolate, você ganha mais um.");
        System.out.println("Com isso, pelo valor de dinheiro que você tem, você pode comer: " +  chocolatesQuePodeComer + " chocolates.");

    }
}
