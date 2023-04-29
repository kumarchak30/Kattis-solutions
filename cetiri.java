import java.util.*;

public class cetiri
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        
        int diffOne = list.get(1) - list.get(0);
        int diffTwo = list.get(2) - list.get(1);
        
        if(diffOne == diffTwo)
            System.out.println(list.get(2)+ diffOne);
        else if(diffTwo > diffOne)
            System.out.println(list.get(2)- diffOne);
        else
            System.out.println(list.get(0) +diffTwo);
        
    }
}