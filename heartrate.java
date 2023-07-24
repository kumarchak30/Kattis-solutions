package Kattis_solves;

import java.util.*;
import java.text.*;
public class heartrate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		DecimalFormat df = new DecimalFormat("0.0000");
		for(int i = 0; i < times;i++)
		{
			int beats = scan.nextInt();
			double sec = scan.nextDouble();
			double mid = (60*beats)/sec;
			double fac = 60/sec;
			System.out.println(df.format(mid-fac) + " "+df.format(mid)+ " "+ df.format(mid+fac));
		}
	}
}