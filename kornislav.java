package Kattis_solves;

import java.util.*;
public class kornislav {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0; i < 4; i++)
			list.add(scan.nextInt());
		Collections.sort(list);
		System.out.println(list.get(0)*list.get(2));
	}
}