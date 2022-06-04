import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        HashSet<String> hashSet = new HashSet<>(); // 중복X, 순서X
        for (int i = 0; i < N ; i++) {
            hashSet.add(br.readLine());
        }
        for (int i = 0; i < M ; i++) {
            String string = br.readLine();
            if (hashSet.contains(string)) count++;
        }
        System.out.println(count);
    }
}