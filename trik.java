package Kattis_solves;

import java.util.*;
public class trik {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();

        int ballPosition = 1; // Start with the ball under the leftmost cup

        for (char move : moves.toCharArray()) {
            if (move == 'A') {
                if (ballPosition == 1) {
                    ballPosition = 2; // Swap the ball to the middle cup
                } else if (ballPosition == 2) {
                    ballPosition = 1; // Swap the ball to the leftmost cup
                }
            } else if (move == 'B') {
                if (ballPosition == 2) {
                    ballPosition = 3; // Swap the ball to the rightmost cup
                } else if (ballPosition == 3) {
                    ballPosition = 2; // Swap the ball to the middle cup
                }
            } else if (move == 'C') {
                if (ballPosition == 1) {
                    ballPosition = 3; // Swap the ball to the rightmost cup
                } else if (ballPosition == 3) {
                    ballPosition = 1; // Swap the ball to the leftmost cup
                }
            }
        }

        System.out.println(ballPosition);
	}

}
