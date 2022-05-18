import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean flag = true;
            if (num == 1){
                continue;
            }
            for (int j = 2; j < num ; j++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                count ++;
            }
        }
        System.out.println(count);
    }

}