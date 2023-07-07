package Kattis_solves;

import java.util.*;
public class knightpacking {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n % 2 == 1)
			System.out.println("first");
		else
			System.out.println("second");
		
		scan.close();
	}

}
