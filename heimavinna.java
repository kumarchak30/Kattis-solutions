package Kattis_solves;

import java.util.*;
public class heimavinna {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		
		if(in.contains(";"))
		{
			int sum =0;
			String harr[] = in.split(";");
			for(int i =0; i < harr.length; i++)
			{
				if(harr[i].contains("-"))
				{
					String warr[] = harr[i].split("-");
					int n = Integer.parseInt(warr[0]);
					int n2 = Integer.parseInt(warr[1]);
					sum+= ((n2-n) + 1);
				}
				else
					sum++;
			}
			System.out.println(sum);
		}
		else
		{
			String arr[] = in.split("-");
			int n = Integer.parseInt(arr[0]);
			int n2 = Integer.parseInt(arr[1]);
			System.out.println((n2-n) + 1);
		}		
	}
}