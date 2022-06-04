import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hashMapString = new HashMap<>();
        HashMap<Integer, String> hashMapInteger = new HashMap<>();
        for (int i = 1; i <= N; i++) { // 도감 번호가 1번부터 시작
            String name = br.readLine();
            hashMapString.put(name, i);
            hashMapInteger.put(i, name);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= M; i++) {
            String tmp = br.readLine();
            if (isNum(tmp)) { // 숫자면 이름 반환
                sb.append(hashMapInteger.get(Integer.parseInt(tmp)) + "\n");
            } else { // 이름이면 숫자 반환
                sb.append(hashMapString.get(tmp) + "\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
