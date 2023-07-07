package Kattis_solves;
import java.util.*;
public class canadianseh {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		if(in.substring(in.length()-3).equals("eh?"))
			System.out.println("Canadian!");
		else
			System.out.println("Imposter!");
	}
}