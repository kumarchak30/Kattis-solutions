package Kattis_solves;

import java.util.*;
public class theplank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		int arr[] = new int[in+1];
		arr[0] = 1;
		
		for(int i = 1; i <= in; i++)
		{
			arr[i] = arr[i-1];
			if(i >= 2)
				arr[i] += arr[i-2];
			if(i >= 3)
				arr[i] += arr[i-3];
		}
		System.out.println(arr[in]);
		scan.close();
	}

}
