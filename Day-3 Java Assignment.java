import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        String numberStr = String.valueOf(number);
        String reversedStr = new StringBuilder(numberStr).reverse().toString();

        return numberStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPalindrome(number)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
