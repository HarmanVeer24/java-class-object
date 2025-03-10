import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text
        System.out.println("Enter a string: ");
        String text = sc.nextLine();

        // Create PalindromeDetails object and display result
        PalindromeDetails checker = new PalindromeDetails(text);
        checker.displayResult();

        sc.close();
    }
}
// PalindromeChecker class to check if a string is a palindrome
class PalindromeDetails {
    String StringText;

    // Constructor to initialize text
    public PalindromeDetails(String StringText) {
        this.StringText = StringText;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String reversed = new StringBuilder(StringText).reverse().toString();
        return StringText.equalsIgnoreCase(reversed);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(StringText + " is a palindrome.");
        } else {
            System.out.println(StringText + " is not a palindrome.");
        }
    }
}
//input
//Enter a string:
//racecar
//output
// racecar is a palindrome
