import java.util.Scanner;

public class Currency
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the amount in rupees : ");
        double rupees = in.nextDouble();

        float usd = (float) (rupees*0.012);
        System.out.print("Thus,"+rupees+" rupees, is equivalent to "+usd+" dollars.");
    }
}
