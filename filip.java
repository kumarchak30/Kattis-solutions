package Kattis_solves;

import java.util.*;
public class filip {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int new1 = reverse(num1);
		int new2 = reverse(num2);
		
		System.out.println(Math.max(new1, new2));
	}
	
	static int reverse(int n)
	{	
		int rev = 0;
		int rem;
		while(n>0)
		{
			rem = n%10;
			rev = (rev*10) + rem;
			n = n/10;
		}
	      return rev;
	}

}
