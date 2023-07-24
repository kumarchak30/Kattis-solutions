import java.util.*;

public class dice {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int base = Math.max(a, b);
        int low = Math.min(a, b);
        int plus1 = base+1;
        for(int i = (low+1); i <= plus1; i++)
        {
            System.out.println(i);
        }
        scan.close();
    }
}