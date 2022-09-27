import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length :- ");
        double length = in.nextDouble();

        System.out.print("Enter breadth :- ");
        double breadth = in.nextDouble();

        double area = length * breadth;
        System.out.println("Thus , area of reactangle is " + area);
    }
}
