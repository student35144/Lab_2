package pl.lublin.wsei.java.cwiczenia.mylib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StrongPasswordGenerator
{
    private int length = 10;
    private boolean smallCharacters = true;
    private boolean bigCharacters = true;
    private boolean numbers = true;
    private boolean specialCharacters = true;

    private static final String allowedSmallCharacters = "abcdefghijklmnopqrstuvwxyz";
    private static final String allowedBigCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String allowedNumbers = "0123456789";
    private static final String allowedSpecialCharacters = "!@#$%&*()_+-=[]|,./?><";


    // GETTERS
    public int getLength() {
        return length;
    }
    public boolean getSmallCharacters() {
        return smallCharacters;
    }
    public boolean getBigCharacters() {
        return bigCharacters;
    }
    public boolean getNumbers() {
        return numbers;
    }
    public boolean getSpecialCharacters() {
        return specialCharacters;
    }
    public String getAllowedSpecialCharacters() {
        return allowedSpecialCharacters;
    }

    // SETTERS
    public void setLength(int newLength) {
        this.length = newLength;
    }
    public void setSmallCharacters(boolean newSmallCharacters) {
        this.smallCharacters = newSmallCharacters;
    }
    public void setBigCharacters(boolean newBigCharacters) {
        this.bigCharacters = newBigCharacters;
    }
    public void setNumbers(boolean newNumbers) {
        this.numbers = newNumbers;
    }
    public void setSpecialCharacters(boolean newSpecialCharacters) {
        this.specialCharacters = newSpecialCharacters;
    }

    public StrongPasswordGenerator()
    {

    }

    public StrongPasswordGenerator(int length)
    {
        this.length = length;
    }

    public StrongPasswordGenerator(int length, boolean smallCharacters)
    {
        this.length = length;
        this.smallCharacters = smallCharacters;
    }

    public StrongPasswordGenerator(int length, boolean smallCharacters, boolean bigCharacters)
    {
        this.length = length;
        this.smallCharacters = smallCharacters;
        this.bigCharacters = bigCharacters;
    }

    public StrongPasswordGenerator(int length, boolean smallCharacters, boolean bigCharacters, boolean numbers)
    {
        this.length = length;
        this.smallCharacters = smallCharacters;
        this.bigCharacters = bigCharacters;
        this.numbers = numbers;
    }

    public StrongPasswordGenerator(int length, boolean smallCharacters, boolean bigCharacters, boolean numbers, boolean specialCharacters)
    {
        this.length = length;
        this.smallCharacters = smallCharacters;
        this.bigCharacters = bigCharacters;
        this.numbers = numbers;
        this.specialCharacters = specialCharacters;
    }

    public String generate()
    {
        Random random = new Random(System.nanoTime());
        StringBuilder stringBuilder = new StringBuilder(length);

        List<String> charCategories = new ArrayList<>(4);

        if (smallCharacters)
            charCategories.add(allowedSmallCharacters);
        if (bigCharacters)
            charCategories.add(allowedBigCharacters);
        if (numbers)
            charCategories.add(allowedNumbers);
        if (specialCharacters)
            charCategories.add(allowedSpecialCharacters);

        for (int i = 0; i < length; i++)
        {
            String password = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(password.length());
            stringBuilder.append(password.charAt(position));
        }
        return stringBuilder.toString();
    }
}
