import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    static int[] visited;
    static ArrayList<Integer>[] lists;
    static int N,M,K,X;
    static List<Integer> answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        lists = new ArrayList[N+1];
        answer = new ArrayList<>();
        for (int i = 1; i <= N ; i++) {
            lists[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            lists[start].add(end);
        }
        visited = new int[N+1];
        for (int i = 0; i <= N; i++) {
            visited[i] = -1;
        }
        BFS(X);
        for (int i = 0; i <= N ; i++) {
            if(visited[i] == K){
                answer.add(i);
            }
        }
        if(answer.isEmpty()){
            System.out.println("-1");
        }else{
            Collections.sort(answer);
            for(int temp:answer){
                System.out.println(temp);
            }
        }
    }
    static void BFS(int node){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        visited[node]++;
        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            for(int i:lists[currentNode]){
                if (visited[i] == -1){
                    visited[i] = visited[currentNode]+1;
                    queue.add(i);
                }
            }
        }
    }
}