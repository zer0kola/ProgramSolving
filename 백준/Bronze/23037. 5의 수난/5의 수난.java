import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int in = Integer.parseInt(br.readLine());
        int sum = 0;
        while(in > 0){
            int n = in%10;
            sum+= n*n*n*n*n;
            in = in/10;
        }
        System.out.println(sum);
     }
}
