import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] members = new String[n][2];
        for (int i = 0; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            members[i][0] = st.nextToken();
            members[i][1] = st.nextToken();
        }
        Arrays.sort(members, new Comparator<String[]>() {
            @Override
            public int compare(String[] member1, String[] member2) {
                return Integer.parseInt(member1[0]) - Integer.parseInt(member2[0]);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(members[i][0] + " " + members[i][1]);
        }

    }

}