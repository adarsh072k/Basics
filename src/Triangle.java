import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Base :- ");
        double base = in.nextDouble();

        System.out.println("Enter height :- ");
        double height = in.nextDouble();

        double area = 0.5*(base*height);
        System.out.println("Hence,area of the triangle is "+area);
    }
}
