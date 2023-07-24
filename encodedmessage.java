import java.util.*;
public class encodedmessage {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    StringBuilder string = new StringBuilder();
    int cases = Integer.parseInt(scan.nextLine());
    for (int i = 0; i < cases; i++) {
      String line = scan.nextLine();
      int rowlen = (int)Math.sqrt(line.length());
      for (int j = rowlen-1; j >=0; j--) {
        for (int k = j; k < line.length(); k+=rowlen) {
          string.append(line.charAt(k));
        }
      }
      string.append(System.lineSeparator());
    }
    System.out.println(string);
  }
}