import java.util.Scanner;
public class stringpalindrome {
    public static void main(String [] args) {
        String a , rev="" ;
        int i  ;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        a = in.next();
        int n = a.length();
        for(i = n-1 ; i>= 0; i--)
            rev = rev + a.charAt(i);
        if (a.equalsIgnoreCase(rev))
            System.out.print("The string is palindrome.");
        else
            System.out.print("The string is not a palindrome.");
        }

    }
