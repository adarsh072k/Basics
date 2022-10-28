package Patterns;

class Pattern2
{
        public static void main(String[] args)
        {
            pattern(5);
        }

        static void pattern(int n)
        {
            for(int row=1;row<=n;row++)
            {
                for(int column=1;column<=row;column++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
