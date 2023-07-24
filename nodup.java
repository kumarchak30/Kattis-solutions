package Kattis_solves;

import java.util.*;
public class nodup {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] in = scan.nextLine().split(" ");
		if(in.length == countDiff(in))
			System.out.println("yes");
		else
			System.out.println("no");
	}
	
	private static int countDiff(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean foundDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    foundDuplicate = true;
                    break;
                }
            }
            if (!foundDuplicate) {
                count++;
            }
        }
        return count;
    }
}