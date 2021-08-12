package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static String matchRegex(String scannerLine, Scanner sc) {
        boolean match = false;
        String varToTest = "";
        Pattern p = Pattern.compile("^(-|\\d)\\d+");
        while(!match) {
            System.out.print(scannerLine);
            varToTest = sc.next();
            match = p.matcher(varToTest).matches();
        }

        return varToTest;
    }

    public static int checkHigher(int i, int j, int k) {
        int[] numbersArray = {i, j, k};
        Arrays.sort(numbersArray);
        return numbersArray[2];
    }

    public static void main(String[] args) {

        System.out.println("Compare 3 números e saiba qual é o maior");
        System.out.println("----------------------------------------");
        Scanner sc = new Scanner(System.in);

        int firstNumber = Integer.parseInt(matchRegex("Primeiro número: ", sc));
        int secondNumber = Integer.parseInt(matchRegex("Segundo número: ", sc));
        int thirdNumber = Integer.parseInt(matchRegex("Terceiro número: ", sc));
        int largestNumber = checkHigher(firstNumber, secondNumber, thirdNumber);

        String message = "O maior dos números é o " + largestNumber;

        System.out.print(message);
        sc.close();
    }
}
