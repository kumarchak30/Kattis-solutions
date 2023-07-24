import java.util.*;
public class ShatteredCake
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int nums = scan.nextInt();
        int area = 0;
        while(nums-- > 0)
            area+= scan.nextInt() * scan.nextInt();
        System.out.println(area/w);
        scan.close();
    }
}