package pl.lublin.wsei.java.cwiczenia.testowe_klasy;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class IsPalindromeTest
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        do {
            System.out.printf("\nPodaj tekst do przerobienia (0 aby zakończyć): ");
            String tekst = scn.nextLine();
            if (tekst.equals("0")) break;

            System.out.print("Tekst: " + tekst + " " + (StringFun.isPalindrome(tekst) ? "" : "nie ") + "jest palindromem");

        } while (true);
    }
}
