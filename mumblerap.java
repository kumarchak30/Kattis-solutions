package Kattis_solves;

import java.util.*;
public class mumblerap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int max = 0;
        String num = "";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num += c;
            } else {
                if (!num.equals("")) {
                    max = Math.max(max, Integer.parseInt(num));
                    num = "";
                }
            }
        }
        if (!num.equals("")) {
            max = Math.max(max, Integer.parseInt(num));
        }
        System.out.println(max);
        sc.close();
	}
}