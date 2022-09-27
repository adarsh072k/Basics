import java.util.Scanner;

public class SurfaceArea
{
    Scanner in = new Scanner(System.in);
    double radius, height, surfaceArea,a;
    double pi=3.14;

    void cylinder()
    {
        System.out.print("Enter radius:- ");
        radius = in.nextDouble();
        System.out.print("Enter height :- ");
        height = in.nextDouble();

        surfaceArea=2*3.14*radius*height;
        System.out.println("Surface Area of cylinder:- "+surfaceArea);
        System.out.println();
    }

    void cube()
    {
        System.out.print("Enter length of edge of cube:- ");
        a = in.nextDouble();

        surfaceArea=6*a*a;
        System.out.println("Surface Area of cube:- "+surfaceArea);
        System.out.println();
    }

    public static void main(String[] args)
    {
        SurfaceArea obj= new SurfaceArea();
        obj.cylinder();
        obj.cube();
    }
}
