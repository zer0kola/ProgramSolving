import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(gcd(a,b));
        System.out.println(lsm(a,b));
    }
    static int gcd (int a, int b){
        int temp = a%b;
        if (temp == 0) return b;
        else {
            return gcd(b,temp);
        }
    }

    static int lsm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}