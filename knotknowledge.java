import java.util.*;
public class knotknowledge
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < times; i++)
        {
            int in = scan.nextInt();
            list.add(in);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < (times-1); i++)
        {
            int input = scan.nextInt();
            arr.add(input);
        }
        
        Collections.sort(arr);
        
        for(int i = 0; i < list.size(); i++)
        {
            if(!arr.contains(list.get(i)))
                System.out.println(list.get(i));
        }
    }
}