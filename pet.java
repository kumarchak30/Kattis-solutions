// solved

import java.util.*;
public class pet {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        
        for ( int i = 0; i < 5; i++)
        {
            arr[i] = 0;
            for ( int j = 0; j < 4; j++)
            {
                arr[i] += scan.nextInt();
            }   
        } 

        int cont = 0;
        int points = 0;
        for (int i = 0; i < 5; i ++)
        {
            if (points < arr[i])
            {
                cont = i+1;
                points = arr[i];
            }
        }

        System.out.println(cont+ " "+ points);
        

        
    }
}