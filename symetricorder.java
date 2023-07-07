package Kattis_solves;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class symetricorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int setCount = 0;

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            setCount++;
            List<String> strings = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                strings.add(scanner.next());
            }

            Collections.sort(strings);

            List<String> result = new ArrayList<>();
            int start = 0;
            int end = n - 1;

            while (start < end) {
                result.add(strings.get(start));
                result.add(strings.get(end));
                start++;
                end--;
            }

            if (start == end) {
                result.add(strings.get(start));
            }

            System.out.println("SET " + setCount);
            for (String str : result) {
                System.out.println(str);
            }
        }

        scanner.close();
    }
}