import java.util.*;
public class combinationlock
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int p = sc.nextInt();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            if (p == 0 && c1 == 0 && c2 == 0 && c3 == 0) break;
            int ans = 1080;
            ans += (p - c1 + 40) % 40 * 9;
            ans += (c2 - c1 + 40) % 40 * 9;
            ans += (c2 - c3 + 40) % 40 * 9;
            System.out.println(ans);
        }
        sc.close();
    }
}