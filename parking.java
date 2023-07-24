
import java.util.*;
public class parking {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        for(int i = 0; i < times; i++)
        {
            int num = scan.nextInt();
            int[] arr = new int[num];
            for(int j = 0; j < num; j++)
            {
                arr[j] = scan.nextInt();
            }
            Arrays.sort(arr);
            int d = (arr[num - 1] - arr[0])*2;
            System.out.println(d);
        }
        scan.close();
    }
}
