package Kattis_solves;

import java.util.*;
public class nastyhacks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		for(int i = 0; i < times;i++)
		{
			int r = scan.nextInt();
			int e = scan.nextInt();
			int c = scan.nextInt();
			
			if(r > e-c)
				System.out.println("do not advertise");
			else if(r < e-c)
				System.out.println("advertise");
			else
				System.out.println("does not matter");
		}
	}
}