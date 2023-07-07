package Kattis_solves;

import java.util.*;
public class pot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		long sum = 0;
		
		for(int i = 0; i < times; i++)
		{
			int in = scan.nextInt();
			int mod = in%10;
			int num = in/10;
			sum+= Math.pow(num, mod);
		}
		System.out.println(sum);
	}
}
