import java.util.*;

public class heirsdilemma
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int limitOne = scan.nextInt();
        int limitTwo = scan.nextInt();
        
        int count = 0;
        for(int i = limitOne; i <= limitTwo; i++)
        {
            if(divisible(i))
                count++;
        }
        
        System.out.println(count);
        
    }
    
    public static boolean divisible(int num)
    {
        int m = num;
        boolean[] arr = new boolean[10];
        
        while(m > 0)
        {
            int r = m%10;
            m = (m-r) / 10;
            
            if(arr[r] )
                return false;
            arr[r] = true;
            
            if(r == 0 || num%r != 0)
                return false;
        }
        return true;
    }
}