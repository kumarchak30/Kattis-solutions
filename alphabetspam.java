package Kattis_solves;

import java.util.*;
public class alphabetspam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		
		int whitespaceCount = 0;
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int symbolCount = 0;
        
        for(char c: in.toCharArray())
        {
        	if (c == '_') {
                whitespaceCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else {
                symbolCount++;
            }
        }
        
        int totalCount = in.length();
        double whitespaceRatio = (double) whitespaceCount / totalCount;
        double lowercaseRatio = (double) lowercaseCount / totalCount;
        double uppercaseRatio = (double) uppercaseCount / totalCount;
        double symbolRatio = (double) symbolCount / totalCount;
        
        System.out.printf("%.16f%n", whitespaceRatio);
        System.out.printf("%.16f%n", lowercaseRatio);
        System.out.printf("%.16f%n", uppercaseRatio);
        System.out.printf("%.16f%n", symbolRatio);
	}

}
