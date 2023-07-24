import java.util.*;

public class whichisgreater {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a < b)
            System.out.println(0);
        else if(a == b)
            System.out.println(0);
        else 
            System.out.println(1);

        scan.close();
    }
}
