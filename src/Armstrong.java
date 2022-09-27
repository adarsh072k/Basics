import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three digit number :- ");
        int num = in.nextInt();
        int sum=0;
        int original = num;

        while(num>0)
        {
            int rem = num % 10;
            num=num/10;
            sum=sum+rem*rem*rem;
        }
        if(sum==original)
            System.out.println(original+" is an armstrong number");
        else
            System.out.println(original+" is not an armstrong number");
    }
}
