package Kattis_solves;

import java.util.*;
public class spavanac {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Read the input time in 24-hour notation
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        // Subtract 45 minutes and handle hour adjustment
        if (minutes < 45) {
            hours = (hours + 24 - 1) % 24; // Handle hour wraparound
        }
        minutes = (minutes + 60 - 45) % 60; // Handle minute wraparound

        // Output the new time in 24-hour notation
        System.out.println(hours + " " + minutes);

        scanner.close();
	}

}
