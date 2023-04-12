import java.util.*;

public class stopwatch
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        int time = 0;
        int previous = 0;
        boolean running = false;
        
        for(int i = 0; i < times; i++)
        {
            int a = scan.nextInt();
            if(running)
                time += a - previous;
            
            running = !running;
            previous = a;
        }
        
        if(running)
            System.out.println("still running");
        else
            System.out.println(time);
    }
}