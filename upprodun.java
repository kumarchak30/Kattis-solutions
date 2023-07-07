package Kattis_solves;
import java.util.*;

public class upprodun {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int num = scan.nextInt();
		
		int teamPerRow = num/rows;
		int remainder = num%rows;
		
		for(int i = 0; i < rows; i++)
		{
			int t = (i < remainder) ? teamPerRow+1 : teamPerRow;
			for(int j = 0; j < t; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
