import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());
            hashMap.put(key, hashMap.getOrDefault(key,0)+1);
            /*
             * getOrDefault(key, defaultValue)
             * key에 대해 map에 저장 된 value를 반환한다.
             * 만약 value가 없을 경우 defaultValue값을 반환한다.
             */
        }
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(hashMap.getOrDefault(key,0)).append(' ');
        }
        System.out.println(sb);
    }
}