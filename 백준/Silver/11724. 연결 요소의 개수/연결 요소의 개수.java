import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited ; // 방문 기록
    static ArrayList<Integer>[] lists ; // 인접리스트
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 노드 갯수
        int M = Integer.parseInt(st.nextToken()); // 엣지 갯수
        lists = new ArrayList[N+1]; // 0번을 쓰지 않아서 N+1개 선언
        visited = new boolean[N+1]; // 0번을 쓰지 않아서 N+1개 선언
        for (int i = 1; i < N+1 ; i++) { // 1부터 N까지
            lists[i] = new ArrayList<Integer>(); // 인접 리스트 초기화
        }
        for (int i = 0; i < M ; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            lists[s].add(e);
            lists[e].add(s); // 양방향 엣지이므로 양쪽에 엣지를 더해줌
       }
        int count = 0; // DFS 메서드의 실행 횟수 == 연결 요소의 개수
        for (int i = 1; i < N+1 ; i++) { // 1부터 N까지
            if (!visited[i]){ // i번째 노드를 방문하지 않았으면 탐색하기
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    static void DFS(int v){
        if (visited[v]){ // 이미 방문했으면 종료
            return;
        }
        visited[v] = true; // 방문했다는 표시를 남겨 줌
        for (int i : lists[v]){
            if (!visited[i]){ // 인접 노드 중 방문하지 않은 노드만 DFS 실행
                DFS(i);
            }
        }
    }
}