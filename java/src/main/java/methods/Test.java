package methods;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] numbs = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter your password: ");
        String password = scanner.nextLine();
        System.out.println("Password-appropriate string: " + checkPassword(password));

        for (int i = 0; i < numbs.length; i++) {
            System.out.println("Please enter number:");
            numbs[i] = Integer.parseInt(scanner.nextLine());
        }

        checkNumbers(numbs);
        isEquals(numbs);

        System.out.println("Please enter first number:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter second number:");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Average value: " + average(a, b));
        System.out.println("Sum: " + sum(a, b));
        System.out.println("Sum of average: " + sum(average(2, 4), average(7,5)));;
    }

    private static double sum(double n1, double n2) {
        return n1 + n2;
    }

    private static double average(double a, double b) {
        double average = sum(a, b) / 2;
        return average;
    }

    private static void isEquals(int[] numbs) {
        Arrays.sort(numbs);
        int count=0;
        for (int i = 0; i < numbs.length; i++) {
            if (i == numbs.length-1){
                break;
            }
            if (numbs[i] == numbs[i+1]) {count++;continue;}
            else break;
        }

        if (count == numbs.length-1){System.out.println("All entered numbers are equal!");}
        else System.out.println("All entered numbers are not equal!");
    }

    private static boolean checkPassword(String password) {
        String pat = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#&()]).{8,}";// цифра, буква малка или голяма, символ
        //(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9@#$%]).{8,}" малка, голяма буква, цифра или символ
        if (password.matches(pat))
            return true;
        else return false;
    }

    private static void checkNumbers(int [] numbs) {
        LinkedList<Integer> numbersPositive = new LinkedList<>();
        LinkedList<Integer> numbersNegative = new LinkedList<>();
        for (int i = 0; i < numbs.length; i++){
            if (numbs[i]>=0) {
                numbersPositive.add(numbs[i]);
            }
            if (numbs[i]< 0 ) {
                numbersNegative.add(numbs[i]);
            }
        }

        if (numbersPositive.size() == numbs.length){
            System.out.println("All entered numbers are positive!");
        }
        if (numbersPositive.size() > 0 && numbersPositive.size() < numbs.length){
            printPositiveNumbers(numbersPositive);
            printNegativeNumbers(numbersNegative);
        }
        if (numbersPositive.size() == 0){
            System.out.println("All entered numbers are negative!");
        }
    }

    private static void printPositiveNumbers(LinkedList<Integer> numbersPositive) {
               String str = "";

            for (Integer num : numbersPositive){
                if (numbersPositive.size() > 1){
                    str += num + ", ";
                }else {
                    str += num;
                }
            }
            str = str.trim();
            if (str.lastIndexOf(",") == str.length() - 1){
                str = str.substring(0, str.length() - 1);
            }
            System.out.println("Positive numbers: " + str);
    }

    private static void printNegativeNumbers(LinkedList<Integer> numbersNegative) {
            String str = "";

            for (Integer num : numbersNegative) {
                if (numbersNegative.size() > 1) {
                    str += num + ", ";
                } else {
                    str += num;
                }
            }
            str = str.trim();
            if (str.lastIndexOf(",") == str.length() - 1) {
                str = str.substring(0, str.length() - 1);
            }
            System.out.println("Negative numbers: " + str);
    }
}

