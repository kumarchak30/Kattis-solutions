import java.util.*;
public class betting {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.printf("%.10f\n", 100.0/num);
        System.out.printf("%.10f\n", 100.0/ (100 - num));
        scan.close();
    }
}
