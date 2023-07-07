package Kattis_solves;
import java.util.*;
public class prsteni {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int arr[] = new int[times];
		for(int i = 0; i < times; i++)
		{
			int temp = scan.nextInt();
			arr[i] = temp;
		}
		int first = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			int gcd = gcd(first, arr[i]);
            int numerator = arr[i] / gcd;
            int denominator = first / gcd;
            System.out.println(denominator + "/" + numerator);
		}
		
		scan.close();
	}
	
	private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
