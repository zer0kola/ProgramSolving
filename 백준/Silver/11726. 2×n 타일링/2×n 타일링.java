import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[n+2];
        count[1] = 1;
        count[2] = 2;
        for (int i = 3; i < n+1 ; i++) {
            count[i] = (count[i-1] + count[i-2])%10007;
        }
        System.out.println(count[n]);
    }
}