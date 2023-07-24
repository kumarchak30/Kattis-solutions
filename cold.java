
import java.util.*;
public class cold {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        int count = 0;
        int[] arr = new int[times];
        for(int i = 0; i < times; i++)
        {
            int temp = scan.nextInt();
            arr[i] = temp;
        }

        for(int k: arr)
        {
            if(k < 0)
                count++;
        }
        System.out.println(count);
        scan.close();
    }
}
