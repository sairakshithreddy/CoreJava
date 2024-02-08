package src.Palindrome;

public class ex02 {
    public static void main(String args[]) {
    int r, sum = 0, temp;
    int n = 454; // Replace with the number you want to check
    temp = n;
    while (n > 0) {
        r = n % 10; // Get the remainder
        sum = (sum * 10) + r;
        n = n / 10;
    }
    if (temp == sum)
        System.out.println("Palindrome number");
    else
        System.out.println("Not a palindrome");
}
}
