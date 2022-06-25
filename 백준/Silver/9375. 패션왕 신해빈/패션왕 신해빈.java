import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t ; i++) {
            HashMap<String, Integer> fashion = new HashMap<>(); // 옷의 종류와 개수
            int n = Integer.parseInt(br.readLine()); // 옷의 개수
            for (int j = 0; j < n ; j++) {
                st = new StringTokenizer(br.readLine());
                String cloth = st.nextToken(); // 옷은 필요 없음
                String category = st.nextToken(); // 종류만 골라서 조합
                if (fashion.containsKey(category)) { // 해당 종류 옷이 있으면 추가
                    fashion.put(category, fashion.get(category) + 1);
                }else{
                    fashion.put(category, 1);
                }
            }
            int result = 1;
            for (int value : fashion.values()){
                result *= (value + 1); // 안 입는 경우 고려해 1 추가
            }
            System.out.println(result -1); // 아무 것도 안 입는 경우 제외
        }
    }
}
