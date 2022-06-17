import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[1001];
        int count = 0;
        for (int i = 1; i < 1001 ; i++) {
            if(i<100) arr[i] = true;
            if (i%10 - (i/10)%10 == (i/10)%10 - (i/100)%10) arr[i] = true;
            if(i ==1000) arr[i] = false;
        }
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            if(arr[i]) count ++;
        }
        System.out.println(count);
    }
}