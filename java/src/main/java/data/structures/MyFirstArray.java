package data.structures;

import java.util.Scanner;

public class MyFirstArray {

    static int [] numbersArray = new int[20];

    public static void main(String[] args) {

        printArraysElements();
        printAverageValue();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of elements in the array: ");
        int n = Integer.parseInt(scanner.next());
        int [] myArray = new int[n];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter %d element: ", i + 1);
            myArray[i] = Integer.parseInt(scanner.next());
            if (myArray[i]%2==0){
                sumEven += myArray[i];
            }
            else {
                sumOdd += myArray[i];
            }
        }
        System.out.printf("The sum of even numbers is: %d%nThe sum of odd numbers is: %d%n", sumEven, sumOdd);

        System.out.println("Please enter number N: ");
        int N = scanner.nextInt();

        printNumbersFromOneToN(N);
        printNumbersNotDivisibleThreeAndSeven(N);
        printSumOfFibonacciNumbers(N);

    }

    private static void printArraysElements() {
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i]=i*5;
            System.out.format("Element with index %d is: %d%n", i, numbersArray[i]);
        }
    }

    private static void printAverageValue() {
            double sum = 0.0;

            for (int num: numbersArray) {
                 sum += num;
            }
        double average = sum / numbersArray.length;
        System.out.format("The average is: %.2f%n", average);
    }

    private static void printNumbersFromOneToN(int N) {
        System.out.printf("The number from 1 to N: %n");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }

    private static void printNumbersNotDivisibleThreeAndSeven(int N) {
        System.out.printf("The numbers that are not divisible by three and seven: %n");
        for (int i = 1; i <= N; i++) {
            if (!(i%3 == 0 && i%7 ==0)){
                System.out.println(i);
            }
        }
    }

    private static void printSumOfFibonacciNumbers(int N) {
        System.out.printf("The Fibonacci numbers: %n");
        int[] arr = new int[N];
        arr[0] = 0;
        arr[1] = 1;
        int sum = 0;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
          //  System.out.println(arr[i]);
        }
        System.out.printf("The sum of the first N members of the Fibonacci series: %d%n", sum);
    }
}
