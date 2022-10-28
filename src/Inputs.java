import java.util.Scanner;

public class Inputs
{
    public static void main(String[] args)
    {
        int sum=0;int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers :- ");
        while(in.hasNext())
        {

            num = in.nextInt();

            if(num==0)
                break;

            sum=sum+num;
        }
        System.out.println("sum of all numbers:- "+sum);
    }
}
