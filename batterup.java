import java.util.Scanner;

public class batterup {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        double total = 0;
        int count = scan.nextInt();
       
        for (int i = 0; i < count; i++) 
        {
            int b = scan.nextInt();
            if (b < 0) continue;
               
            n++;
            total+=(double)b;
        }
        System.out.println(total/n);
    }
}