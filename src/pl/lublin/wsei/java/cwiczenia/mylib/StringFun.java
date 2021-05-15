package pl.lublin.wsei.java.cwiczenia.mylib;

import java.util.Locale;

public class StringFun
{
    public static String anarchize(String passText)
    {
        String newText = "";

        if (passText.isEmpty())
        {
            System.out.print("Nie podano żadnego słowa!");
        }

        if (Character.isLowerCase(passText.charAt(0)))
        {
            for (int i=0; i< passText.length(); i+=2)
            {
                newText += Character.toUpperCase(passText.charAt(i));
                if(i+1<passText.length())
                    newText += Character.toLowerCase(passText.charAt(i+1));
            }
        }
        else
        {
            for (int i=0; i< passText.length(); i+=2)
            {
                newText += Character.toLowerCase(passText.charAt(i));
                if(i+1<passText.length())
                    newText += Character.toUpperCase(passText.charAt(i+1));
            }
        }
        return newText;





    }
}
