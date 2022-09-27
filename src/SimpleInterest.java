import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal amount :-");
        double principal = in.nextDouble();

        System.out.print("Enter rate of interest charged :-");
        double rate = in.nextDouble();

        System.out.print("Enter time duration :-");
        double time = in.nextDouble();

        double si = (principal*rate*time)/100;
        System.out.println("Simple interest is "+si);
    }
}