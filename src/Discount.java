import java.sql.SQLOutput;
import java.util.Scanner;

public class Discount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marked price of the product :- ");
        double markedPrice= in.nextDouble();
        System.out.print("Enter the discount percentage for the product,given to customer :- ");
        double discount= in.nextDouble();

        double s= 100-discount;
        double amountAfterDiscount= (s*markedPrice)/100;
        System.out.println("Amount after discount :- "+amountAfterDiscount);
    }
}
