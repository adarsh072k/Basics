import java.sql.SQLOutput;
import java.util.Scanner;

public class Volume
{
    double radius, height,volume, base, length, baseWidth;
    double pi=3.14;
    Scanner in = new Scanner(System.in);
    void cone()
    {
        System.out.print("Enter radius of cone:- ");
        radius=in.nextDouble();
        System.out.print("Enter height of cone:- ");
        height=in.nextDouble();

        volume = (pi*radius*radius*height)/3;
        System.out.print("Volume of cone:- "+volume);
        System.out.println();
    }

    void prism()
    {
        System.out.print("Enter base of prism:- ");
        base=in.nextDouble();
        System.out.print("Enter height of prism:- ");
        height=in.nextDouble();

        volume= base * height;
        System.out.print("Volume of prism :- "+volume);
        System.out.println();
    }

    void cylinder()
    {
        System.out.print("Enter radius of cylinder:- ");
        radius=in.nextDouble();
        System.out.print("Enter height of cylinder:- ");
        height=in.nextDouble();

        volume = pi*radius*radius*height;
        System.out.print("Volume of cylinder:- "+volume);
        System.out.println();
    }

    void sphere()
    {
        System.out.print("Enter radius of cylinder:- ");
        radius=in.nextDouble();

        volume=(4*pi*radius*radius*radius)/3;
        System.out.println("Volume of sphere:- "+volume);
        System.out.println();
    }

    void pyramid()
    {
        System.out.print("Enter base length of pyramid:- ");
        length=in.nextDouble();
        System.out.print("Enter base width of pyramid:- ");
        baseWidth=in.nextDouble();
        System.out.print("Enter height of pyramid:- ");
        height=in.nextDouble();

        volume=(length*baseWidth*height)/3;
        System.out.println("Volume of Pyramid:- "+volume);
        System.out.println();
    }

    public static void main(String[] args)
    {
        Volume obj=new Volume();
        obj.pyramid();
        obj.sphere();
        obj.cylinder();
        obj.prism();
        obj.cone();
    }
}
