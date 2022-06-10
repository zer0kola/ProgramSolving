import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t ; i++) {
            String s = br.readLine();
            System.out.print(s.charAt(0));
            System.out.println(s.charAt(s.length()-1));
        }
     }
}
