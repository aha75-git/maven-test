package org.example.schulung;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciseTDDMedium {

    public static String reverseString(String input) {
        if  (input == null || input.isEmpty()) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        String textLowerCase = text.toLowerCase();
        String reverse = new StringBuilder(textLowerCase).reverse().toString();
        return textLowerCase.equals(reverse);
    }

    public static int countVowels(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
