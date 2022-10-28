import java.util.Scanner;

public class inputsLargest
{
    public static void main(String[] args)
    {
        int max = Integer.MIN_VALUE;
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers :- ");
        while (in.hasNext())
        {

            num = in.nextInt();

            if (num == 0)
                break;

            if (num > max)
            {
                max = num;
            }
        }

        System.out.println("Largest number is:- " + max);
    }
}
