package com.matheus;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static String matchRegex(String scannerLine, Scanner sc) {
        boolean match = false;
        String varToTest = "";
        Pattern p = Pattern.compile("\\d+");
        while(!match) {
            System.out.print(scannerLine);
            varToTest = sc.next();
            match = p.matcher(varToTest).matches();
        }
        return varToTest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String number = matchRegex("Descubra os n primeiros números primos: ", sc);
        int parsedNumber = Integer.parseInt(number);
        Prime primes = new Prime();
        ArrayList<Integer> firstNPrimes = primes.getFirstNPrimes(parsedNumber);

        String message = "Os " + number + " primeiros números primos são: ";

        System.out.println(message);
        System.out.println(firstNPrimes);
        sc.close();
    }
}
