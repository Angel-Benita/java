import java.util.Scanner;
public class matrix {
    public static void main(String args[]) {
        int i , j;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter row and column:");
        int row = s.nextInt();
        int column =s.nextInt();
        int array[][]= new int[row][column];
        for (i = 0;i< row ;i++)
        {
            for(j = 0;j<column ;j++)
            {
                array[i][j]= 1;
                System.out.println("");
            }
        }
        System.out.println("The matrix is :");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                System.out.print( array[i][j] +"");
            }
            System.out.println("");
        }
    }
}
