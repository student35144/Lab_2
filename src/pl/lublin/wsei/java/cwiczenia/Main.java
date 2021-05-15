package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;
import pl.lublin.wsei.java.cwiczenia.mylib.StrongPasswordGenerator;

import java.io.Console;

public class Main
{
    public static void main(String[] args)
    {
        String passwd1 = new StrongPasswordGenerator(10, true, false, false, false).generate();
        String passwd2 = new StrongPasswordGenerator(12, true, true, false, false).generate();
        String passwd3 = new StrongPasswordGenerator(14, true, true, true, false).generate();
        String passwd4 = new StrongPasswordGenerator(16, false, false, true, true).generate();
        String passwd5 = new StrongPasswordGenerator(20, true, true, true, true).generate();

        System.out.printf(passwd1 + "\n");
        System.out.printf(passwd2 + "\n");
        System.out.printf(passwd3 + "\n");
        System.out.printf(passwd4 + "\n");
        System.out.printf(passwd5 + "\n");
    }

    public static void zad1()
    {
        Account acc = new Account();
        acc.setName("michał Czaja");
        System.out.println(acc.getName());

        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
        System.out.printf("%s%n",Account.capitalize("kamil adamski"));
        System.out.printf("%s%n",Account.translit("Adam Nowak"));
        System.out.printf("%s%n",Account.translit("Michał Czaja"));
        System.out.printf("%s%n",Account.translit("Seweryn Krajewski"));
        System.out.printf("%s%n",Account.translit("Nataniel Kawalec"));
    }
}
