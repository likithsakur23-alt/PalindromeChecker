import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    static boolean check(String str){

        str = str.replaceAll("\\s","").toLowerCase();

        int i = 0;
        int j = str.length() - 1;

        while(i < j){

            if(str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if(check(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}