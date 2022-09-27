import java.util.Scanner;

public class Circle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius :- ");
        double radius = in.nextDouble();

        double area= Math.PI*radius*radius;
        System.out.println("Area of circle is :- "+area);
    }
}
