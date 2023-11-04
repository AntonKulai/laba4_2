package com.laba42;
public class Decoder {
    public static String decodeVowels(String encodedText) {
        // Декодування за правилом заміни голосних
        return encodedText.replaceAll("a", "1")
                .replaceAll("e", "2")
                .replaceAll("i", "3")
                .replaceAll("o", "4")
                .replaceAll("u", "5");
    }

    public static String decodeConsonants(String encodedText) {
        // Декодування за правилом заміни приголосних
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < encodedText.length(); i++) {
            char currentChar = encodedText.charAt(i);
            if (isConsonant(currentChar)) {
                decodedText.append((char)(currentChar + 1));
            } else {
                decodedText.append(currentChar);
            }
        }
        return decodedText.toString();
    }

    private static boolean isConsonant(char c) {
        // Перевірка, чи символ є приголосним
        return "bcdfghjklmnpqrstvwxyz".contains(String.valueOf(c));
    }
}