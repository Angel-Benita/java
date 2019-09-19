import java.util.Scanner;
    class employee
    {
        public static void main(String args[])

        {
            String name;
            int age;
            String profession;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the name :");
            name = in.nextLine();
            System.out.print("Enter age :");
            age = in.nextInt();
            System.out.print("Enter the profession :");
            profession = in.next();
            System.out.println(" The  details are :\n name = " +name +"\n age = " +age  + "\n profession = " +profession);
        }
    }
