package Kattis_solves;

import java.util.Arrays;
import java.util.Scanner;

public class buildinghighways {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of cities
        int[] problematicLevels = new int[N];

        // Read the problematic levels of each city
        for (int i = 0; i < N; i++) {
            problematicLevels[i] = scanner.nextInt();
        }

        // Sort the problematic levels in ascending order
        Arrays.sort(problematicLevels);

        // Calculate the minimum sum of difficulty levels
        long sumDifficulty = 0;
        for (int i = 0; i < N - 1; i++) {
            sumDifficulty += (long) problematicLevels[i] * problematicLevels[i + 1];
        }

        System.out.println(sumDifficulty);
    }
}

