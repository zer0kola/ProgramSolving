import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (Objects.equals(order, "add")) {
                set.add(Integer.parseInt(st.nextToken()));
            } else if (Objects.equals(order, "remove")) {
                set.remove(Integer.parseInt(st.nextToken()));
            } else if (Objects.equals(order, "check")) {
                if(set.contains(Integer.parseInt(st.nextToken()))) bw.write(String.valueOf(1)+'\n');
                else bw.write(String.valueOf(0)+'\n');
            } else if (Objects.equals(order, "toggle")) {
                int num = Integer.parseInt(st.nextToken());
                if (set.contains(num)) set.remove(num);
                else set.add(num);
            } else if ((Objects.equals(order, "all"))) {
                set.clear();
                for (int j = 1; j < 21; j++) {
                    set.add(j);
                }
            } else set.clear();
        }
        bw.flush();
    }
}
