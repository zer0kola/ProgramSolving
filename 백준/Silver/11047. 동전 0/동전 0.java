import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coin = Integer.parseInt(st.nextToken());
        int value = Integer.parseInt(st.nextToken());
        int[] coinArray = new int[coin];
        int count = 0;
        for (int i = 0; i < coin; i++) {
            coinArray[i] = Integer.parseInt(br.readLine());
        }
        for (int i = coin - 1; i >= 0; i--) {
            if (coinArray[i] <= value) {
                count += value / coinArray[i];
                value = value % coinArray[i];
            }
        }
        System.out.println(count);
    }
}