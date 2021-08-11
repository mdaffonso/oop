package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static boolean checkRange(String input, int min, int max) {
        int valueToCheck = Integer.parseInt(input);
        if(valueToCheck >= min && valueToCheck <= max) {
            return true;
        }
        return false;
    }

    public static String matchRegex(String scannerLine, Scanner sc, int min, int max) {
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
            range = checkRange(varToTest, min, max);
            if(!range) match = false;
        }


        return varToTest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu primeiro nome: ");
        String nome = sc.next();

        System.out.print("Digite o seu último sobrenome: ");
        String sobrenome = sc.next();

        String dd = matchRegex("Digite o dia do seu nascimento em formato numeral: ", sc, 1, 31);
        String mm = matchRegex("Digite o mês do seu nascimento em formato numeral: ", sc, 1, 12);
        String yyyy = matchRegex("Digite o ano do seu nascimento em formato numeral: ", sc, 1900, 2021);

        String initials = Character.toString(nome.charAt(0)) + Character.toString(sobrenome.charAt(0));
        String date = dd + "/" + mm + "/" + yyyy;

        System.out.print(String.format("Token: %1s %2s%3s %4s", nome, sobrenome, initials, date));
        sc.close();
    }
}
