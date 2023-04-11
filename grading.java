import java.util.*;

public class grading
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int score = scan.nextInt();
        
        if(score <= 100 && (score >= a))
            System.out.println("A");
        else if(score < a && score >= b)
            System.out.println("B");
        else if(score < b && score >= c)
            System.out.println("C");
        else if(score < c && score >= d)
            System.out.println("D");
        else if(score < d && score >= e)
            System.out.println("E");
        else
            System.out.println("F");
    }
}

/*
99 89 79 69 59
*/