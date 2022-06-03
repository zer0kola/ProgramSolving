import java.io.*;
import java.util.*;

// 어떤 노드의 유망성을 판단한 뒤 유망하지 않으면 부모 노드로 돌아감

public class Main {
    static int N; // 1부터 N 까지의 자연수
    static int M; // 중복 없이 M개를 고름
    static int[] arr; // 선택한 수 배열
    static boolean[] visited; // 방문했는지 확인
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M]; // M개를 고를 예정
        visited = new boolean[N];
        dfs(0); // 0번부터 채움
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if (depth == M) { // 깊이가 M만큼 찼으면
            for (int val : arr) {
                sb.append(val).append(' '); // 방문한 노드 출력
            }
            sb.append('\n');
        } else {
            for (int i = 0; i < N; i++) {
                if (!visited[i]) { // i번째 요소를 방문하지 않았으면
                    visited[i] = true; // 해당 노드를 방문상태로 변경
                    arr[depth] = i + 1; // 해당 깊이를 index로 해 i+1값 저장
                    dfs(depth + 1); // 다음 자식 노드 방문을 위해 깊이 1 증가
                    visited[i] = false; // 자식 노드 방문이 끝나면 방문하지 않은 상태로 변경
                }
            }
        }
    }
}