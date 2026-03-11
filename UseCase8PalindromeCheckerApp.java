import java.util.LinkedList;
import java.util.Scanner;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        for(char c : input.toCharArray())
            list.add(c);

        boolean isPalindrome = true;

        while(list.size() > 1) {

            if(list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}