import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        int rev, temp, sum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int num= in.nextInt();

        temp=num;
        while(num>0)
        {
            rev=num%10;
            sum=(sum*10)+rev;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
