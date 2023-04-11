import java.util.Scanner;
public class zoom
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 1; i <= n; i++)
        {
            int num = scanner.nextInt();
            if (i % k == 0)
            {
                System.out.print(num + " ");
            }
        }
    }
}