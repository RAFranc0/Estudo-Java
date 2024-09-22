package com.rafranco.utils;

//Criei essa classe para que não fosse necessário instanciar o Scanner em todos os exercícios

import java.util.Scanner;

public class ScannerUtils {
    static Scanner input = new Scanner(System.in);

    public static int LerInt()
    {
        return input.nextInt();
    }

    public static String LerString()
    {
        return input.next();
    }

    public static double LerDouble()
    {
        return input.nextDouble();
    }
}
