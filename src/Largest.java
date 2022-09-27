import java.util.Scanner;

public class Largest
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int num1= in.nextInt();
        System.out.print("Enter the second number:- ");
        int num2= in.nextInt();

        if(num1==num2)
        {
            System.out.println("Both the numbers are equal.");
        }
        else if(num1>num2)
        {
            System.out.print("The first number:- " + num1+" is the largest");
        }
        else
            System.out.print("The second number:- " + num2+" is the largest");
    }
}
