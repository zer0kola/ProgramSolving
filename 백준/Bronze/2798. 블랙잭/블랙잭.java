import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max=-1;
        int temp=-1;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    temp = arr[i] + arr[j] + arr[k];
                    if (temp == m) break;
                    else if (temp > max && temp <m) max = temp;
                }
                if (temp == m) break;// break를 하나만 쓰면 for 문 하나만 나옴
            }
            if (temp == m) break;
        }
        if (temp==m) System.out.println(temp);
        else System.out.println(max);
    }
}
