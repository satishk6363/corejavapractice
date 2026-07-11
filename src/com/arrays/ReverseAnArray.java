package com.arrays;

import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the size of the array
        System.out.print("Enter the size of the array: ");

        // Store the array size
        int size = scanner.nextInt();

        // Create an integer array of the given size
        int[] numbers = new int[size];

        // Read array elements from the user
        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");

            numbers[i] = scanner.nextInt();
        }

        // Create an object of ReverseAnArray class
        ReverseAnArray reverse = new ReverseAnArray();

        // Call reverseArray() method and store the returned array
        int[] reversedArray = reverse.reverseArray(numbers);

        // Print the reversed array
        System.out.println("\nReversed Array:");

        for (int i = 0; i < reversedArray.length; i++) {

            System.out.print(reversedArray[i] + " ");
        }

        // Close Scanner object
        scanner.close();
    }

    // Method to reverse the array
    int[] reverseArray(int[] originalArray) {

        // Create a new array to store reversed elements
        int[] reversedArray = new int[originalArray.length];

        // Copy elements in reverse order
        for (int i = originalArray.length - 1; i >= 0; i--) {

            reversedArray[originalArray.length - i - 1] = originalArray[i];
        }

        // Return the reversed array
        return reversedArray;
    }
}
