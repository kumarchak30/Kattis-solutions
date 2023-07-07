package Kattis_solves;

import java.util.*;
public class textureanalysis {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numLine = 1;
		
		while(true)
		{
			String line = scan.nextLine();
			if (line.equals("END"))
				break;
			int prev = -1;
            int diff = -1;
            boolean even = true;
            for(int i = 0; i < line.length(); i++)
            {
            	if(line.charAt(i) == '*')
            	{
            		if(prev != -1)
            		{
            			if(diff == -1)
            				diff = 	i - prev - 1;
            			else if(diff != i-prev-1)
            			{
            				even = false;
            				break;
            			}
            		}
            		prev = i;
            	}
            }
            System.out.println(numLine + " " + (even ? "EVEN" : "NOT EVEN"));
            numLine++;
		}
	}

}
