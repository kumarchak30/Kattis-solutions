import java.util.HashSet;
import java.util.*;
 
public class boatparts
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int N = sc.nextInt();
 
        ArrayList<String> parts = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= N; i++)
        {
            String part = sc.next();
            if (!parts.contains(part))
            {
                parts.add(part);
                count++;
            }
            if (count == P)
            {
                System.out.println(i);
                return;
            }
        }
 
        System.out.println("paradox avoided");
    }
}