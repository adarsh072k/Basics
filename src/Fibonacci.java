import java.util.Scanner;

class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n, firstTerm = 0, secondTerm = 1;
        System.out.print("Enter number of times, till you want the series:- ");
        n=in.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
