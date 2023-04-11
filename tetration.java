import java.util.*;
import java.io.*;
public class tetration 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));             
        StringTokenizer str = new StringTokenizer(in.readLine());

        double n = Double.parseDouble(str.nextToken());
        System.out.printf("%.6f", Math.pow(n, 1/n));
        out.close();
    }
}