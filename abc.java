package Kattis_solves;

import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            int in = scan.nextInt();
            arr[i] = in;
        }
        scan.nextLine();
        String order = scan.nextLine();

        Arrays.sort(arr); // Sort the array in ascending order

        int[] result = new int[3];
        for (int i = 0; i < 3; i++) {
            char c = order.charAt(i);
            if (c == 'A') {
                result[i] = arr[0];
            } else if (c == 'B') {
                result[i] = arr[1];
            } else if (c == 'C') {
                result[i] = arr[2];
            }
        }

        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}

