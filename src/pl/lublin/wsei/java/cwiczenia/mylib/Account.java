package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

public class Account
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = capitalize(name);
    }

    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }

    private static String ukrAlphabet [] = {"а","б","в","г","д","е","є","ж","з","и","і","ї","й","к","л","м","н","о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ь","ю","я"};
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j","k","l","m","n","o","p","r","s","t","u","f","h","c", "ch","sh","shh","'","ju","ja"};

    public static String translit(String arg)
    {
        arg = arg.toLowerCase();
        String transcriptedCharacters="";

        for(int i = 0; i < arg.length(); i++)
        {
            char currentChar = arg.charAt(i);
            int index = Arrays.asList(translitRepl).indexOf(String.valueOf(currentChar));
            if(index<0 || index>32)
                transcriptedCharacters+=currentChar;
            else
                transcriptedCharacters+=ukrAlphabet[index];
        }
        return transcriptedCharacters;
    }

}
