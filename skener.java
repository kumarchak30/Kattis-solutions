import java.util.*;
public class skener
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int ZR = scan.nextInt();
        int ZC = scan.nextInt();
        scan.nextLine();
        String[][] arr = new String[row][col];

        for(int i = 0; i < row; i++)
        {
            String input = scan.nextLine();
            for(int j = 0; j < col; j++)
            {
                arr[i][j] = input.substring(j, j+1);
            }
        } 
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < ZR; j++)
            {
                for(int k = 0; k < arr[0].length; k++)
                {
                    for(int m = 0; m < ZC; m++)
                    {
                        System.out.print(arr[i][k]);
                    }
                }
                System.out.println();
            }
        }
        scan.close();
    }
}