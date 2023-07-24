import java.util.*;

public class countthevowels {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        String in = scan.nextLine();

        for(int i = 0; i < in.length(); i++)
        {
            if(in.substring(i, i+1).equalsIgnoreCase("a"))
                count++;
            if(in.substring(i, i+1).equalsIgnoreCase("e"))
                count++;
            if(in.substring(i, i+1).equalsIgnoreCase("i"))
                count++;
            if(in.substring(i, i+1).equalsIgnoreCase("o"))
                count++;
            if(in.substring(i, i+1).equalsIgnoreCase("u"))
                count++;
        }
        System.out.println(count);
        scan.close();
    }
}
