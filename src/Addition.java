import java.util.Scanner;

public class Addition
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 :- ");
        int num2 = in.nextInt();

        int sum= num1+num2;
        System.out.print("Sum of the above two numbers is "+sum);
    }
}
