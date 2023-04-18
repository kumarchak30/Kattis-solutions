import java.util.*;

public class oddmanout
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        
        for(int i = 0; i < times; i++)
        {
            Set<Integer> hash = new HashSet<>();
            int in = scan.nextInt();
            
            for(int j = 0; j < in; j++)
            {
                update(hash, scan.nextInt());
            }
            
            System.out.println("Case #" + (i+1) + ": " + hash.iterator().next());
        }
    }
    
    public static void update(Set<Integer> set, int number)
    {
        if (set.contains(number))
            set.remove(number);
        else 
            set.add(number);
    }
}