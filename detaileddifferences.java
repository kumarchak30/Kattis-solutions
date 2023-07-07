package Kattis_solves;
import java.util.*;
public class detaileddifferences {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        scan.nextLine();
        
        for(int i  = 0; i < times; i++)
        {
            String in = scan.nextLine();
            String in2 = scan.nextLine();
            String INarr[] = in.split("");
            String IN2arr[] = in2.split("");
            int c = INarr.length;
            System.out.println(in);
            System.out.println(in2);
            int j = 0;
            while(c > 0)
            {
                if(INarr[j].equals(IN2arr[j]))
                    System.out.print(".");
                else
                    System.out.print("*");
                j++;
                c--;
            }
            System.out.println();
            System.out.println();
        }

	}

}
