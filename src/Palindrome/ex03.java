package src.Palindrome;
import java.util.Scanner;
public class ex03 { public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string/number to check if it is a palindrome:");
    String original = scanner.nextLine();
    StringBuilder reverseWord = new StringBuilder(original).reverse();
    String reversedWord = reverseWord.toString();
    if (original.equals(reversedWord))
        System.out.println("Entered is a palindrome.");
    else
        System.out.println("Entered isn't a palindrome.");
}
}
