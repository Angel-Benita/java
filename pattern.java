import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int n,i,j, k=1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. of lines:");
        n = in.nextInt();
        if (n ==0) {
            System.out.print("No pattern to be printed.");
        }
        else {
            for(i=0;i<n;i++) {
                for(j=0;j<k;j++) {
                    System.out.print("*");
                }
                k=k+1;
                System.out.println();
            }
        }
    }
}
