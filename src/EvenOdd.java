import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num= in.nextInt();

        if (num % 2 == 0)
            {
                System.out.print(num + " is an even number.");
            }
            else
                System.out.print(num + " is an odd number.");
    }
}
