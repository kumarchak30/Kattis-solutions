package Kattis_solves;

import java.util.*;
public class everywhere {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();

        for (int i = 0; i < times; i++) {
            int test = scan.nextInt();
            scan.nextLine(); // Consume the newline character

            String[] arr = new String[test];
            for (int j = 0; j < test; j++) {
                String in = scan.nextLine();
                arr[j] = in;
            }

            int count = countDistinctCities(arr);
            System.out.println(count);
        }

        scan.close();
    }

    private static int countDistinctCities(String[] arr) {
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
