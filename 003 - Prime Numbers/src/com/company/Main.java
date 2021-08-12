package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static boolean checkPositive(String input) {
        int valueToCheck = Integer.parseInt(input);
        if(valueToCheck > 0) {
            return true;
        }
        return false;
    }

    public static String matchRegex(String scannerLine, Scanner sc) {
        boolean match = false;
        boolean range = false;
        String varToTest = "";
        Pattern p = Pattern.compile("\\d+");
        while(!range) {
            while(!match) {
                System.out.print(scannerLine);
                varToTest = sc.next();
                match = p.matcher(varToTest).matches();
            }
            range = checkPositive(varToTest);
            if(!range) match = false;
        }


        return varToTest;
    }

    public static boolean isPrime(int number) {
        if(number == 1) return false;
        if(number == 2) return true;
        if(number % 2 == 0) return false;
        for(int i = 3; i <= number/2; i+=2) {
            if(number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String number = matchRegex("Digite um número para conferir se ele é primo: ", sc);
        int parsedNumber = Integer.parseInt(number);
        boolean isItPrime = isPrime(parsedNumber);

        String message = isItPrime
                ? "O número " + parsedNumber + " é primo."
                : "O número " + parsedNumber + " não é primo.";

        System.out.print(message);
        sc.close();
    }
}
