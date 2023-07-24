
import java.util.*;
public class skocimis
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] positions = new int[3];
        for (int i = 0; i < 3; i++) {
            positions[i] = scanner.nextInt();
        }

        Arrays.sort(positions); // Sort the positions in ascending order

        int maxMoves = Math.max(positions[1] - positions[0], positions[2] - positions[1]) - 1;

        System.out.println(maxMoves);

        scanner.close();
    }
}