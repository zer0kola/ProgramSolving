import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int end = -1;
        int[][] meet = new int[n][2];
         for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meet[i][0] = Integer.parseInt(st.nextToken());
            meet[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(meet, new Comparator<int[]>() {
            @Override
            public int compare(int[] meet1, int[] meet2) {
                if (meet1[1] == meet2[1]){ // 두 회의의 종료 시간이 같을 때
                    return meet1[0] - meet2[0]; // 시작 시간 기준 정렬
                }
                return meet1[1] - meet2[1]; // 종료 시간 기준 정렬
            }
        });
        for (int i = 0; i < n ; i++) {
            if (meet[i][0] >= end) { // 회의의 시작 시간이 겹치지 않으면
                end = meet[i][1]; //
                count ++;
            }
        }
        System.out.println(count);
    }
}