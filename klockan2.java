package Kattis_solves;

import java.util.*;
public class klockan2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int angle = scanner.nextInt();

        int hour = (angle / 30) % 12;
        int minute = (angle % 30) * 2;

        if (minute != 0) {
            double minuteAngle = minute * 6;
            double hourAngle = hour * 30 + (minuteAngle / 12);

            hour = (int) Math.round(hourAngle / 30) % 12;
            minute = (int) Math.round(minuteAngle / 6) % 60;
        }

        String hourStr = String.format("%02d", hour);
        String minuteStr = String.format("%02d", minute);

        System.out.println(hourStr + ":" + minuteStr);
	}

}
