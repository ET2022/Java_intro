package math;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

public class MyMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Please enter third number: ");
        int c = scanner.nextInt();

        System.out.println("The largest number is " + max( a, max(b, c)));


        System.out.print("Input Side-1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side-2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side-3: ");
        double side3 = scanner.nextDouble();
        System.out.println( isValid(side1, side2,side3) ?
                String.format("The area of the triangle is %.2f", areaTriangle(side1, side2, side3)) : "Invalid triangle" );


        System.out.print("Please enter the number of elements in the array: ");
        int n = scanner.nextInt();
        fillWithRandomNumbers(n);

    }
    public static boolean isValid(double side1, double side2, double side3) {
        if( side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side1 + side3 > side2) return true;
        else return false;
    }
    public static double areaTriangle(double side1, double side2, double side3) {
        double area = 0;
        double s = (side1 + side2 + side3)/2;
        area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
    }
    public static void fillWithRandomNumbers(int n){
        int [] myArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println(random.nextInt(0,100));
        }
    }
}
