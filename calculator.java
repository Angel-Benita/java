import java.util.Scanner;
public class calculator {
    static public void main(String args[]) {
        double a , b ;
        double res = 0;
        String op;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the  operators :");
        a = s.nextDouble();
        b = s.nextDouble();
        System.out.print("Enter the operand :");
        op = s.next();
        switch(op){
            case "+" :
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Arithematic Exception");
                }
                res = a / b;
                break;
            default:
                System.out.print("Enter valid operator");

        }
       System.out.println("The result is " + res);
    }
}
