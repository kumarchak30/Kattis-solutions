import java.util.*;
public class datum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] cal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = scan.nextInt();
        int month = scan.nextInt();

        for(int i  = 0; i < month; i++)
        {
            if( i > 0)
                day += cal[i-1];
        }

        switch(day % 7)
        {
            case 0:
                System.out.println("Wednesday");
                break;
            case 1:
                System.out.println("Thursday");
                break;
            case 2:
                System.out.println("Friday");
                break;
            case 3:
                System.out.println("Saturday");
                break;
            case 4:
                System.out.println("Sunday");
                break;
            case 5:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Tuesday");
                break;
        }
    }
}