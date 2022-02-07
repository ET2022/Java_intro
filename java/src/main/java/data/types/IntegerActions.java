package data.types;

import java.util.Scanner;

public class IntegerActions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = scanner.nextInt();

        printLargestNumber(firstNumber,secondNumber,thirdNumber);

        System.out.println("Please enter height of the rectangle in mm: ");
        int heightRectangle = scanner.nextInt();
        System.out.println("Please enter length of the rectangle in mm: ");
        int lengthRectangle = scanner.nextInt();

        printPerimeterFaceRectangle(heightRectangle, lengthRectangle);

        System.out.println("Please enter number: ");
        int myNumber = scanner.nextInt();

        printEvenOrOddNumber(myNumber);

        System.out.println("Please enter day of the week: ");
        int dayOfTheWeek = scanner.nextInt();

        printDayOfTheWeek(dayOfTheWeek);
    }

    public static void printLargestNumber(int a,int b,int c){

            if ((a>=b) && (a>=c)){
        System.out.println("The largest number is " + a);
            }
            else if((b>=a) && (b>=c)){
        System.out.println("The largest number is " + b);
            }
            else{
        System.out.println("The largest number is " + c);
            }
    }

    public static void printPerimeterFaceRectangle(int heightRectangle,int lengthRectangle) {

        System.out.println("The perimeter of the rectangle is " + (2*heightRectangle+2*lengthRectangle) + " mm");
        System.out.println("The face of the rectangle is " + (heightRectangle*lengthRectangle) + " sq mm");
    }

    public static void printEvenOrOddNumber(int myNumber) {

        if (myNumber%2 == 0){
            System.out.println("The number " + myNumber + " is even.");
        }
        else{
            System.out.println("The number " + myNumber + " is odd.");
        }
    }

    public static void printDayOfTheWeek(int dayOfTheWeek){
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("You have selected " + dayOfTheWeek + ". Day of the week is Monday.");
                break;
            case 2:
                System.out.println("You have selected " + dayOfTheWeek + ". Day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("You have selected " + dayOfTheWeek + ". Day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("You have selected " + dayOfTheWeek + ". Day of the week is Thursday.");
                break;
            case 5:
                System.out.println("You have selected " + dayOfTheWeek + ". Day of the week is Friday.");
                break;
            case 6:
                System.out.println("You have selected " + dayOfTheWeek + ". Day of the week is Saturday.");
                break;
            case 7:
                System.out.println("You have selected " + dayOfTheWeek + ". Day of the week is Sunday.");
                break;
            default:
                System.out.println("Not correct option!");
            }
        }
}
