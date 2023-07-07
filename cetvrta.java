package Kattis_solves;

import java.util.*;
public class cetvrta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the coordinates of the three points
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Find the missing fourth point
        int x4, y4;

        if (x1 == x2)
            x4 = x3;
        else if (x1 == x3)
            x4 = x2;
        else
            x4 = x1;

        if (y1 == y2)
            y4 = y3;
        else if (y1 == y3)
            y4 = y2;
        else
            y4 = y1;

        // Output the coordinates of the missing fourth point
        System.out.println(x4 + " " + y4);
    }
}