import java.util.*;
import java.io.*;

public class reversebinary
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String binary = Integer.toBinaryString(a);
        String reversedBinary = new StringBuilder(binary).reverse().toString();
        int convert = Integer.parseInt(reversedBinary, 2);
        System.out.println(convert);
        
    }
}