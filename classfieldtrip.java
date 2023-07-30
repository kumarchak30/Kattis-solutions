package Kattis_solves;

import java.util.*;
public class classfieldtrip {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		String in2 = scan.nextLine();
		String[] t = (in+in2).split("");
		String out = "";
		Arrays.sort(t);
		for(String i :t)
			out+= i;
		System.out.println(out);
	}
}
