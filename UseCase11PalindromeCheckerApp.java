import java.util.Scanner;

class PalindromeService {

    boolean check(String str){

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
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeService service = new PalindromeService();

        if(service.check(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}