package com.rafranco.utils;

// i've made these two methods static so that they can be called without instantiating the class
// to use it, you can call PrintUtils.printArray(array) or PrintUtils.printLineByLine(array)

// if they were not static, you would have to instantiate the class to call them
// PrintUtils printUtils = new PrintUtils();
// printUtils.printArray(array);
// printUtils.printLineByLine(array);
public class PrintUtils {
    public static void printLineByLine(int[] array) {
        for (int number : array) { // when possible, use the enhanced for loop instead of the traditional for loop for (int i = 0; i < array.length; i++)...
            System.out.println(number);
        }
    }

    public static void printSameLine(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}