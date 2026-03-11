import java.util.Scanner;

interface PalindromeStrategy {

    boolean check(String str);
}

class SimplePalindromeStrategy implements PalindromeStrategy {

    public boolean check(String str){

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

class PalindromeContext {

    PalindromeStrategy strategy;

    PalindromeContext(PalindromeStrategy strategy){
        this.strategy = strategy;
    }

    boolean execute(String str){
        return strategy.check(str);
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeContext context =
                new PalindromeContext(new SimplePalindromeStrategy());

        if(context.execute(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}