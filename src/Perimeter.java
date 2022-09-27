import java.util.Scanner;
public class Perimeter
{
    int r, l, b, s1, s2, s3,a,base;
    double pi = 3.14,perimeter;
    Scanner s = new Scanner(System.in);
    void circle()
    {
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle:"+perimeter);
    }
    void rectangle()
    {
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
    }
    void triangle()
    {
        System.out.print("Enter length of first side of triangle:");
        s1 = s.nextInt();
        System.out.print("Enter length of second side of triangle:");
        s2 = s.nextInt();
        System.out.print("Enter length of third side of triangle:");
        s3 = s.nextInt();
        perimeter = s1 + s2 + s3;
        System.out.println("Perimeter of triangle:"+perimeter);
    }

    void equilateralTriangle()
    {
        System.out.print("Enter length of side of the equilateral triangle:");
        a = s.nextInt();

        perimeter = 3*a;
        System.out.println("Perimeter of equilateral triangle:"+perimeter);
    }

    void parallelogram()
    {
        System.out.print("Enter length of side :- ");
        a = s.nextInt();
        System.out.print("Enter length of side of the base :- ");
        base = s.nextInt();

        perimeter = 2*(a+base);
        System.out.println("Perimeter of parallelogram :- "+perimeter);
        System.out.println();
    }

    void square()
    {
        System.out.print("Enter length of side :- ");
        a = s.nextInt();

        perimeter = 4*a;
        System.out.println("Perimeter of square :- "+perimeter);
        System.out.println();

    }
    void rhombus()
    {
        System.out.print("Enter length of side :- ");
        a = s.nextInt();

        perimeter = 4 * a;
        System.out.println("Perimeter of rhombus :- " + perimeter);
        System.out.println();
    }
    public static void main(String[] args)
    {
        Perimeter obj = new Perimeter();
        obj.rhombus();
        obj.square();
        obj.parallelogram();
        obj.equilateralTriangle();
        obj.circle();
        obj.rectangle();
        obj.triangle();
    }
}