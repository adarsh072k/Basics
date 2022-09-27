import java.util.Scanner;

public class CircPerimeter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius :- ");
        double radius = in.nextDouble();

        double perimeter= 2*Math.PI*radius;
        System.out.println("Perimeter of circle is :- "+perimeter);
    }
}
