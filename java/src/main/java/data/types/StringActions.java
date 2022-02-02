package data.types;

import java.util.Scanner;

public class StringActions {
    public static void main(String[] args) {
        String testString = "My name is <MyName>";

        // Заместване на <MyName> с текст от конзола

        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String newString = testString.replaceAll("<MyName>", name);

        System.out.println("Original string: " + testString);
        System.out.println("New String: " + newString);

        // Сравнение на 2 подадени от конзола стринга

        System.out.println("Please enter your first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Please enter your second string: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("\""+ str1 + "\"" + " is equal to " + "\"" + str2 + "\"");
        }
        else{
            System.out.println(str1 + " is not equal to " + str2);
        }

        //Преброяване на думи в newString

        String [] stringArray = newString.split(" ");
        System.out.println( "\""+ newString + "\"" + " has " + stringArray.length + " words.");

        //Конкатениране на 2 и 3 стринга

        System.out.println("Please enter first string: ");
        String firstString = scanner.nextLine();
        System.out.println("Please enter second string: ");
        String secondString = scanner.nextLine();
        System.out.println("Please enter third string: ");
        String thirdString = scanner.nextLine();

        String strConcatenation = firstString.concat(" " + secondString);
        System.out.println("The concatenated first and second strings: " + strConcatenation);

        String strConcatenation2 = firstString.concat(secondString + " " + thirdString);
        System.out.println("The concatenated first, second and third strings: " + strConcatenation2);
    }
}
