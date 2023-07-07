package Kattis_solves;

import java.util.*;
public class grassseed {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double multiply = scan.nextDouble();
		int times = scan.nextInt();
		double count = 1;
		double sum = 0;
		for(int i = 0; i < times; i++)
		{
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			count *= a;
			count *= b;
			sum += count;
			count = 1;
		}
		System.out.println(multiply*sum);
		scan.close();
	}

}
