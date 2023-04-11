import java.util.*;

public class blueberrywaffle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double f = scan.nextDouble();
        
        if(Math.round(f/r) % 2 == 0)
            System.out.println("up");
        else
            System.out.println("down");
    }
}