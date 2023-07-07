package Kattis_solves;

import java.util.*;
public class anotherbrick {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		int bricks = scan.nextInt();
		int arr[] = new int[bricks];
		
		for(int i =0; i < bricks; i++)
			arr[i]= scan.nextInt();
		
		int wallw = 0;
		boolean possible = true;
		
		for(int i =0; i < bricks; i++)
		{
			wallw += arr[i];
			
			if(wallw > w)
			{
				possible = false;
				break;
			}
			
			if(wallw == w)
			{
				wallw = 0;
				h--;
				if(h == 0)
					break;
			}
		}
		
		if(possible && h ==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}