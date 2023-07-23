package Kattis_solves;

import java.util.*;
public class chanukah {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0; i < times; i++)
		{
			int num = scan.nextInt();
			int days = scan.nextInt();
			map.put(num, days);
		}
		
		for(Integer i: map.keySet())
        {
            System.out.println(i + " " + (sumVal(map.get(i))+map.get(i)));
        }
	}
	public static int sumVal(Integer num)
	{
		int n = num;
		int sum = 0;
		for(int i =1; i <= n; i++)
			sum+= i;
		return sum;
	}
}
