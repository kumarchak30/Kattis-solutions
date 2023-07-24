import java.util.*;
public class skruop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int volume = 7;
        for (int i = 0; i < n; i++) {
            String request = sc.nextLine();
            if (request.equals("Skru op!")) {
                volume++;
                if (volume > 10) volume = 10;
            } else if (request.equals("Skru ned!")) {
                volume--;
                if (volume < 0) volume = 0;
            }
        }
        System.out.println(volume);
        sc.close();
    }
}
