import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int Fiblength, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length:");
        Fiblength = s.nextInt();
        int[] num = new int[Fiblength];
        num[0] = 0;
        num[1] = 1;
        for (i = 2; i < Fiblength; i++)
            num[i] = num[i - 1] + num[i - 2];
        System.out.println("Fibonacci series is :");
        for( i=0;i<Fiblength;i++)
            System.out.print(num[i] +"\t");
    }
}
