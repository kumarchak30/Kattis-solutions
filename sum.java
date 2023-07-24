import java.util.*;
public class sum {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        int count = 0;
        for(int i = 0; i < times; i++)
        {
            count+= scan.nextInt();
        }
        System.out.println(count);
        scan.close();
    }
}
