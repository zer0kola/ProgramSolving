import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);
        int m = Integer.parseInt(br.readLine());
        int[] numbers = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        for (int i : numbers) {
            int startIndex = 0;
            int endIndex = cards.length - 1;
            boolean find = false;
            while (startIndex <= endIndex) {
                int midIndex = (startIndex + endIndex) / 2;
                if (i > cards[midIndex]) {
                    startIndex = midIndex + 1;
                } else if (i < cards[midIndex]) {
                    endIndex = midIndex - 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) System.out.print(1 + " ");
            else System.out.print(0 + " ");
        }
    }

}