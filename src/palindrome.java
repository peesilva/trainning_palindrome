import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write a phrase: ");
        String palavra = sc.nextLine();
        sc.close();

        if (isPalindrome(palavra)) {
            System.out.println(palavra + " is a palindrome.");
        } else {
            System.out.println(palavra + " isnt a palindrome.");
        }
    }

    public static boolean isPalindrome(String palavra) {
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        int length = palavra.length();
        for (int i = 0; i < length / 2; i++) {
            if (palavra.charAt(i) != != palavra.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}