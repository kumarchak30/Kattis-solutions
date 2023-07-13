package Kattis_solves;

// Solved only one of the test groups. will update once the second group is done.

import java.util.*;
class multtable {
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long target = scan.nextLong();

        System.out.println(findOccurrences(n, target));
    }

    public static int findOccurrences(long n, long target) {
        int count = 0;
        for (long i = 1; i <= n; i++) {
            if (target % i == 0 && target / i <= n) {
                count++;
            }
        }
        return count;
    }
}