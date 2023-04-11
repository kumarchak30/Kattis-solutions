import java.util.*;

public class modulo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] remainders = new int[42]; // array to keep track of counts of remainders
        for (int i = 0; i < 10; i++)
        {
            int num = sc.nextInt();
            int remainder = num % 42;
            remainders[remainder]++; // update count of the remainder
        }

        int count = 0;
        
        for (int i = 0; i < 42; i++)
        {
            if (remainders[i] > 0)
            {
                count++; // count distinct remainders
            }
        }

        System.out.println(count);
    }
}