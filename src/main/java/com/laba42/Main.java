package com.laba42;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть метод кодування (1 - голосні, 2 - приголосні):");
        int method = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        System.out.println("Введіть зашифроване повідомлення:");
        String encodedText = scanner.nextLine();

        if (method == 1) {
            String decodedText = com.laba42.Decoder.decodeVowels(encodedText);
            System.out.println("Розшифроване повідомлення: " + decodedText);
        } else if (method == 2) {
            String decodedText = com.laba42.Decoder.decodeConsonants(encodedText);
            System.out.println("Розшифроване повідомлення: " + decodedText);
        } else {
            System.out.println("Неправильний вибір методу кодування.");
        }
    }
}
