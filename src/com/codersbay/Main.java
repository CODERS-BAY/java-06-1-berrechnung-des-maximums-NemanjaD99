package com.codersbay;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter numbers or q to quit!");
        Scanner scanner = new Scanner(System.in);

        // hasNext returniert wahr/falsch wert
        // boolean hasQ = scanner.hasNext("q");
        // System.out.println(hasQ);

        int[] numbers = new int[0];

        while (!scanner.hasNext("q")) {
            int number = scanner.nextInt();
            System.out.println("you entered " + number);

            int[] newArray = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }

            newArray[numbers.length] = number;
            numbers = newArray;
            System.out.println(Arrays.toString(newArray));
//----------------------------------------------------------
            Arrays.sort(numbers);
            System.out.print("Max= " + numbers[numbers.length - 1]);


        }
    }

}