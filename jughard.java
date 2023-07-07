package Kattis_solves;

import java.io.*;
public class jughard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int d = Integer.parseInt(line[2]);

            if (d == a || d == b) {
                bw.write("Yes\n");
                continue;
            } else if (d > a + b) {
                bw.write("No\n");
                continue;
            }

            int gcd = calcGCD(a, b);
            if (d % gcd == 0)
                bw.write("Yes\n");
            else
                bw.write("No\n");
        }
        bw.flush();
    }

    private static int calcGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
} 
