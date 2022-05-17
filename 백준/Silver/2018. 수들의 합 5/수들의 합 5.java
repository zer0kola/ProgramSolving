import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;
        while (end < N) {
            if (sum == N){ // 해당하는 경우 
                count++;
                end ++;
                sum += end;
            }else if (sum > N){ // 크니까 범위를 줄임
                sum -= start;
                start ++;
            }else { // 작으니까 범위를 늘림
                end ++;
                sum += end;
            }
        }
        System.out.println(count);
    }
}
