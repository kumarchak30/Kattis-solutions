import java.util.*;
public class qaly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of periods

        double totalQALY = 0.0;

        // Process each period and calculate QALY
        for (int i = 0; i < N; i++) {
            double quality = scanner.nextDouble();
            double years = scanner.nextDouble();
            double q = quality * years;
            totalQALY += q;
        }

        System.out.println(totalQALY);
        scanner.close();
    }
}

