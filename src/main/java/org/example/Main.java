package org.example;

public class Main {
    public static void main(String[] args) {
        // Konsol çıktılarını kontrol etmek için:
        System.out.println(isPalindrome(-1221));
        System.out.println(isPerfectNumber(28));
        System.out.println(numberToWords(123));
    }

    public static boolean isPalindrome(int number) {
        int absNumber = Math.abs(number);
        int originalNumber = absNumber;
        int reverseNumber = 0;

        while (absNumber > 0) {
            int lastDigit = absNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            absNumber /= 10;
        }
        return originalNumber == reverseNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number && number != 0;
    }

    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";

        String numberStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (char digit : numberStr.toCharArray()) {
            switch (digit) {
                case '0': result.append("Zero "); break;
                case '1': result.append("One "); break;
                case '2': result.append("Two "); break;
                case '3': result.append("Three "); break;
                case '4': result.append("Four "); break;
                case '5': result.append("Five "); break;
                case '6': result.append("Six "); break;
                case '7': result.append("Seven "); break;
                case '8': result.append("Eight "); break;
                case '9': result.append("Nine "); break;
            }
        }
        return result.toString().trim();
    }
}