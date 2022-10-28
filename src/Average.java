import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers you want to enter:- ");
        int nums = sc.nextInt();
        int count = 1;
        float  everyNumber, average, sum = 0;
        while (count <= nums)
        {
            System.out.print("Enter number "+count+":- ");
            everyNumber = sc.nextInt();
            sum =sum+ everyNumber;
            ++count;
        }
        average = sum/nums;
        System.out.println("The Average of above numbers is "+average);

    }

}
