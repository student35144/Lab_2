package pl.lublin.wsei.java.cwiczenia.mylib;

import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

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

    public static String camelize(String passText)
    {
        String newText = "";

        passText = passText.toLowerCase();
        String[] stringArray = passText.split("\\s+");

        for(int i=0; i<stringArray.length; i++)
        {
            if (i == 0)
                newText += stringArray[i];
            else
            {
                String currentWord = stringArray[i];
                String newWord = "";
                for (int j=0; j<currentWord.length(); j++)
                {
                    if (j == 0)
                        newWord += Character.toUpperCase(currentWord.charAt(j));
                    else
                        newWord += Character.toLowerCase(currentWord.charAt(j));
                }
                newText += newWord;
            }
        }
        return newText;
    }

    public static String decamelize(String passText)
    {
        String newWord = "";
        for (int i=0; i<passText.length(); i++)
        {
            if(Character.isUpperCase(passText.charAt(i)))
            {
                newWord = newWord + " ";
            }
            newWord += Character.toLowerCase(passText.charAt(i));
        }
        return newWord;
    }
}
