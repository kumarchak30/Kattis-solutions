import java.util.*;
import java.io.*;

public class avion
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String one = scan.nextLine();
        String two = scan.nextLine();
        String three = scan.nextLine();
        String four = scan.nextLine();
        String five = scan.nextLine();
        
        if(one.contains("FBI"))
            System.out.print(1+" ");
        if(two.contains("FBI"))
            System.out.print(2+" ");
        if(three.contains("FBI"))
            System.out.print(3+" ");
        if(four.contains("FBI"))
            System.out.print(4+" ");
        if(five.contains("FBI"))
            System.out.print(5+" ");
            
        if(!one.contains("FBI") && !two.contains("FBI") && !three.contains("FBI") && !four.contains("FBI") && !five.contains("FBI"))
            System.out.print("HE GOT AWAY!");
    }
}