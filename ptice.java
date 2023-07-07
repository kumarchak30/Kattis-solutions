package Kattis_solves;

import java.util.*;

public class ptice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ansLen = scan.nextInt();
        scan.nextLine();
        String ansGuess = scan.nextLine();

        String adrian = "ABC";
        String bruno = "BABC";
        String goran = "CCAABB";

        int adrianScore = 0;
        int brunoScore = 0;
        int goranScore = 0;

        for (int i = 0; i < ansLen; i++) {
            char ans = ansGuess.charAt(i);

            if (ans == adrian.charAt(i % adrian.length())) {
                adrianScore++;
            }
            if (ans == bruno.charAt(i % bruno.length())) {
                brunoScore++;
            }
            if (ans == goran.charAt(i % goran.length())) {
                goranScore++;
            }
        }

        int maxScore = Math.max(adrianScore, Math.max(brunoScore, goranScore));

        System.out.println(maxScore);

        if (adrianScore == maxScore) {
            System.out.println("Adrian");
        }
        if (brunoScore == maxScore) {
            System.out.println("Bruno");
        }
        if (goranScore == maxScore) {
            System.out.println("Goran");
        }

        scan.close();
    }
}
