import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] chess;
    static int min = 64; // 8*8 체스판을 전부 다 칠하는 경우의 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        chess = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'W') chess[i][j] = true;
                else chess[i][j] = false;
            }
        }

        int nRow = n - 7;
        int nCol = m - 7;
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    static void find(int x, int y) {
        int lastX = x + 8;
        int lastY = y + 8;
        int count = 0;
        boolean rightColor = chess[x][y];
        for (int i = x; i < lastX; i++) {
            for (int j = y; j < lastY; j++) {
                if (chess[i][j] != rightColor) count++;
                rightColor = !rightColor;
            }
            rightColor = !rightColor;
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
