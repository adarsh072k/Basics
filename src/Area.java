import java.util.Scanner;

public class Area
{
    Scanner in = new Scanner(System.in);
    double radius, length, breadth, area, base , height,a , b, diagonal1, diagonal2;
    double pi=3.14;
    void circle()
    {
        System.out.print("Enter radius:- ");
        radius = in.nextDouble();

        area = pi*radius*radius;
        System.out.print("Area of circle:- "+area);
        System.out.println();
    }
    void rectangle()
    {
        System.out.print("Enter length:- ");
        length = in.nextDouble();
        System.out.print("Enter breadth:- ");
        breadth = in.nextDouble();

        area = length*breadth;
        System.out.println("Area of rectangle:- "+area);
        System.out.println();
    }
    void triangle()
    {
        System.out.print("Enter Base :- ");
        base = in.nextDouble();

        System.out.print("Enter height :- ");
        height = in.nextDouble();

        area = 0.5*(base*height);
        System.out.print("Hence,area of the triangle is "+area);
        System.out.println();
    }
    void isosceles()
    {
        System.out.print("Enter the length of same sided:- ");
        a = in.nextDouble();
        System.out.print("Enter length of side two:- ");
        b = in.nextDouble();

        area =(b/4)*Math.sqrt((4*a*a)-(b*b));
        System.out.print("Hence,area of isosceles triangle is "+area);
        System.out.println();
    }

    void parallelogram()
    {
        System.out.print("Enter Base :- ");
        base = in.nextDouble();

        System.out.print("Enter height :- ");
        height = in.nextDouble();

        area = base * height;
        System.out.print("Hence,area of parallelogram is "+area);
        System.out.println();
    }

    void rhombus()
    {
        System.out.print("Enter length of Diagonal 1  :- ");
        diagonal1 = in.nextDouble();
        System.out.print("Enter length of Diagonal 2 :- ");
        diagonal2 = in.nextDouble();

        area = 0.5*(diagonal1 * diagonal2);
        System.out.print("Hence,area of parallelogram is "+area);
        System.out.println();
    }

    void equilateralTriangle()
    {
        System.out.print("Enter length of side :- ");
        a = in.nextDouble();

        area = Math.sqrt(3)*a*a/4;
        System.out.print("Hence,area of Equilateral triangle is "+area);
        System.out.println();
    }

    public static void main(String[] args)
    {
        Area obj=new Area();
        obj.equilateralTriangle();
        obj.rhombus();
        obj.parallelogram();
        obj.isosceles();
        obj.triangle();
        obj.circle();
        obj.rectangle();
    }
}
