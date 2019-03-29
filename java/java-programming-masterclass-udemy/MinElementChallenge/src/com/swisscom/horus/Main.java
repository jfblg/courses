package com.swisscom.horus;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();
//
        int[] returnedIntegers = readIntegers(count);
//        int returnedMin = findMin(returnedIntegers);
//        System.out.println("The found minimal number is: " + returnedMin);

        System.out.println("Normal array:");
        System.out.println(Arrays.toString(returnedIntegers));
        reverse(returnedIntegers);
        System.out.println("Reversed array:");
        System.out.println(Arrays.toString(returnedIntegers));

    }

    private static void reverse(int[] array) {
        int steps;
        int maxIndex = array.length - 1;

        if (array.length % 2 == 0) {
            steps = array.length / 2;
        } else {
            steps = (array.length - 1) / 2;
        }

        for(int i=0; i < steps; i++) {
            int buffer = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = buffer;
        }
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for(int i=0; i<count; i++) {
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}
