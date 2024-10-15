package com.rafranco.aula02;

import com.rafranco.utils.ScannerUtils;

public class Exercicio10 {
    public static void main(String[] args) {

        int centavos;

        int[] moedas = {100, 50, 25, 10, 5, 1};
        int[] troco = new int[6];

        System.out.print("Digite o valor a ser trocado em centavos: ");
        centavos = ScannerUtils.lerInt();

        for (int i = 0; i < moedas.length; i++)
        {
            while(centavos > 0)
            {
                if (centavos >= moedas[i]){

                    centavos -= moedas[i];
                    troco[i] += 1;
                }
                else
                {
                    break;
                }
            }
        }

        for (int i = 0; i < moedas.length; i++)
        {
            System.out.printf("Moedas de R$%.2f: %d.\n", (double)moedas[i]/100, troco[i]);
        }
    }
}
