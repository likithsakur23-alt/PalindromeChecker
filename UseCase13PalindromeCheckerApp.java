import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    static boolean check(String str){

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

        long start = System.nanoTime();

        boolean result = check(input);

        long end = System.nanoTime();

        System.out.println("Palindrome: " + result);
        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}