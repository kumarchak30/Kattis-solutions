package Kattis_solves;

import java.util.*;
public class herman {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		
		double euclidian = Math.PI * Math.pow(radius, 2);
		double taxicab = 2 * Math.pow(radius, 2);
		
		System.out.printf("%.6f%n", euclidian);
		System.out.printf("%.6f%n", taxicab);


	}
	

}
