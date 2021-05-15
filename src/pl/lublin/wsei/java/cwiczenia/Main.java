package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class Main
{
    public static void main(String[] args)
    {
        System.out.printf(StringFun.decamelize("adamNowakMaKota"));
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
