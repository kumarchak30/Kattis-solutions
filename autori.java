import java.util.*;
public class autori
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String[] in = scan.nextLine().split("-");
        
        for(int i = 0; i < in.length; i++)
        {
            System.out.print(in[i].substring(0, 1));
        }
        
    }
}