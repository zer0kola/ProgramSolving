import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int[][] people = new int[number][2];
        StringTokenizer st ;
        for (int i = 0; i < number ; i++) {
            st = new StringTokenizer(br.readLine());
            people[i][0] = Integer.parseInt(st.nextToken()); // 무게
            people[i][1] = Integer.parseInt(st.nextToken()); // 키
        }

        for (int i = 0; i < number ; i++) {
            int rank = 1;
            for (int j = 0; j < number ; j++) {
                if (i == j) continue;
                if (people[i][0]<people[j][0] && people[i][1]<people[j][1]){
                    rank ++; // i번째가 j번째보다 키, 몸무게 다 작으면 등수가 1위씩 밀림
                }
            }
            System.out.print(rank + " ");
        }

    }
}