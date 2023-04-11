import java.util.*;

public class soylent
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        
        for(int i = 0; i < times; i++)
        {
            double in = scan.nextDouble();
            System.out.println((int)Math.ceil(in/400));
        }
    }
}