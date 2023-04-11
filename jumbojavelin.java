import java.util.*;

public class jumbojavelin
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        int count = 0;
        for(int i = 0; i < times; i++)
        {
            int in = scan.nextInt();
            count += in;
        }
        System.out.println(count - (times-1));
    }
}