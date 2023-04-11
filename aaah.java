import java.util.*;
public class aaah
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String doc = scan.nextLine();

        int count = input.length() - input.replace("a", "").length();
        int counts = doc.length() - doc.replace("a", "").length();

        if(count >= counts)
            System.out.println("go");
        else if (counts > count )
            System.out.println("no");

    }
}