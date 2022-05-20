import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[0]*arr[T-1]);
    }
}