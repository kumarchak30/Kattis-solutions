
import java.util.*;
public class sibice {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        double diag = Math.sqrt((w*w) + (h*h));
        int[] arr = new int[num];
        for(int i = 0; i < num; i ++)
        {
            int temp = scan.nextInt();
            arr[i] = temp;
        }

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] <= diag)
                System.out.println("DA");
            else   
                System.out.println("NE");
        }
        scan.close();
    }
}
