import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[] lists;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken()); // 노드 개수
        int edge = Integer.parseInt(st.nextToken()); // 엣지 개수
        int startNode = Integer.parseInt(st.nextToken()); // 시작점
        lists = new ArrayList[node + 1]; // 인접리스트: 정점보다 1개 많이 선언 (0번을 안 씀)

        for (int i = 1; i <= node; i++) { // 1부터 node까지
            lists[i] = new ArrayList<>();
        }
        for (int i = 0; i < edge; i++) { //edge의 개수만큼 초기화
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            lists[start].add(end);
            lists[end].add(start);
        }
        for (int i = 1; i <= node; i++) { // 방문할 수 있는 정점이 여러 개면 오름차순으로
            Collections.sort(lists[i]);
        }
        visited = new boolean[node + 1];// 정점보다 1개 많이 선언 (0번을 안 씀)
        DFS(startNode);
        System.out.println();

        visited = new boolean[node + 1];
        BFS(startNode);
        System.out.println();
    }

    static void DFS(int node) {
        System.out.print(node + " ");
        visited[node] = true; // 이 정점은 방문했다고 표시
        for (int i : lists[node]) { // 이 정점에 연결된 요소들 모두 탐색
            if (!visited[i]) { // i번째 정점을 방문하지 않았으면 다시 DFS
                DFS(i);
            }
        }
    }

    static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node); // 시작점을 큐에 넣음
        visited[node] = true; // 시작점 방문했다고 표시

        while (!queue.isEmpty()) { // 큐가 빌 때까지
            int currentNode = queue.poll(); // 큐에서 값을 빼옴
            System.out.print(currentNode + " ");
            for (int i : lists[currentNode]) { // 이 정점에 연결된 요소들 모두 탐색
                if (!visited[i]) { // i번째 정점을 방문하지 않았으면
                    visited[i] = true; // 이 정점은 방문했다고 표시
                    queue.add(i); // 순서대로 큐에 삽입
                }
            }
        }
    }

}