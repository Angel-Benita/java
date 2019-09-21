import java.util.Scanner;
public class fullname {
    public static String Additionfunction(String a, String b) {
        String sum;
        sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        String a , b;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the first name:");
        a = in.next();
        System.out.print("Enter the last name:");
        b = in.next();
        String sum = Additionfunction(a,b);
        System.out.println("The full name is :"+ sum);
    }
}
