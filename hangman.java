import java.util.*;
import java.io.*;

public class hangman
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char[] arr = scan.next().toCharArray();
        int count = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(word.contains(arr[i] + ""))
                word = word.replace(arr[i] + "", "");
            else
                count++;
            if(word.length() == 0)
            {
                System.out.println("WIN");
                return;
            }
            else if(count == 10)
            {
                System.out.println("LOSE");
                return;
            }
        }
    }
}