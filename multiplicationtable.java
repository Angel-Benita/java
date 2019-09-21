import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args) {
        int i,n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = in.nextInt();
        for(i=1;i<=10;i++) {
            System.out.println(n+" X "+i+"="+n*i);
        }
    }
}
