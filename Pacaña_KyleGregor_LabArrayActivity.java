/*
 * Name: Kyle Gregor G. Pacaña
 * Course: BS ECE
 * Lab Activity: Array Implementation and For Loop Practice - Problem 1
 * Submission Date: November 20, 2024
 */
package pacaña_kylegregor_labarrayactivity;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Pacaña_KyleGregor_LabArrayActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("Type 0 for Sum and Average of an Array");
        System.out.println("Type 1 for Maximum and Minimum Element Finder");
        System.out.println("Type 2 for Reverse an Array");
        System.out.println("Type 3 for Frequency Counter");

        int choice = input.nextInt();

        switch (choice) {
            case 0:
                calculateSumAndAverage(input);
                break;
            case 1:
                findMaxAndMin(input);
                break;
            case 2:
                reverseArray(input);
                break;
            case 3:
                countFrequency(input);
                break;
            default:
                System.out.println("Invalid option");
        }

        input.close();
    }

    public static void calculateSumAndAverage(Scanner input) {
        int[] array = new int[10];
        int sum = 0;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }

        double average = sum / 10.0;

        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + average);

        // Sample Input:
        // 5 10 15 20 25 30 35 40 45 50
        // Sample Output:
        // Sum of array: 275
        // Average of array: 27.5
    }

    public static void findMaxAndMin(Scanner input) {
        int[] array = new int[15];

        System.out.println("Enter 15 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];

            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        // Sample Input:
        // 12 32 32 1 2 3 4 6 6 3 2 1 4 8 9 
        // Sample Output:
        // Maximum element: 32
        // Minimum element: 1
    }

    public static void reverseArray(Scanner input) {
        double[] array = new double[5];

        System.out.println("Enter 5 floating-point numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("Array in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Sample Input:
        // 12 23 32 45 65
        // Sample Output:
        // Array in reverse order:65.0 45.0 32.0 23.0 12.0
    }

    public static void countFrequency(Scanner input) {
        int[] array = new int[10];

        System.out.println("Enter 10 integers between 1 and 100:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Enter the number to check its frequency:");
        int numberToCheck = input.nextInt();

        int count = 0;
        for (int num : array) {
            if (num == numberToCheck) {
                count++;

            }
        }

        System.out.println("The number " + numberToCheck + " appears " + count + " times in the array.");
        // Sample Input:
        // 12 54 65 45 54 65 21 12 3 4
        // Sample Output:
        // Enter the number to check its frequency: 12
        // The number 1 appears 1 times in the array.
    }
}
