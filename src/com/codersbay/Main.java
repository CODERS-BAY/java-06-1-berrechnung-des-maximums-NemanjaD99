package com.codersbay;

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


            int temp;
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
                for (int j = 0; j < numbers.length - 1; j++) {
                    // System.out.print( a[j+1]+" --- ");
                    System.out.println(Arrays.toString(numbers));
                    if (numbers[j] > numbers[j + 1]) {
                        temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
            System.out.print("           \nAfter Sorting : ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");

            }
            System.out.print("Max= " +(numbers[numbers.length - 1]+" "));
        }
    }

}