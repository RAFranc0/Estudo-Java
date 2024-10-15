package com.rafranco.utils;

//Criei essa classe para que não fosse necessário instanciar o Scanner em todos os exercícios

import java.util.Scanner;

public class ScannerUtils {

    // in Java, the default access modifier is package-private. in this case, it's the same as protected.
    // when using Singleton-like classes (like this one), it's better to use private access modifier.
    // this variable should also be final, as it's a constant.
    private static final Scanner input = new Scanner(System.in);

    public static int lerInt()
    {
        return input.nextInt();
    }

    public static String lerString()
    {
        return input.next();
    }

    public static double lerDouble()
    {
        return input.nextDouble();
    }
}
