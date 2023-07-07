package Kattis_solves;

import java.util.*;
public class fodelsedagsmemorisering {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        scan.nextLine();

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, String> nameMap = new HashMap<String, String>();

        for (int i = 0; i < times; i++) {
            String in = scan.nextLine();
            String arr[] = in.split(" ");
            String name = arr[0];
            int rating = Integer.parseInt(arr[1]);
            String birthday = arr[2];

            if (!map.containsKey(birthday) || rating > map.get(birthday)) {
                map.put(birthday, rating);
                nameMap.put(birthday, name);
            }
        }

        List<String> chosenFriends = new ArrayList<String>(nameMap.values());
        Collections.sort(chosenFriends);
        System.out.println(chosenFriends.size());
        for (String friend : chosenFriends) {
            System.out.println(friend);
        }
    }
}
