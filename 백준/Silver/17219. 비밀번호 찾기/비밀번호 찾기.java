import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, String> password = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            password.put(st.nextToken(), st.nextToken());
        }
        for (int i = 0; i < m ; i++) {
            bw.write(password.get(br.readLine())+'\n');
        }
        bw.flush();
    }
}
