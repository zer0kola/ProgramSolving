import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        boolean[] check = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = fun(i); // n은 i를 생성자로 하는 수
            if (n < 10001) check[n] = true; // 배열에서 n을 제외
        }

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) System.out.println(i);
        }
    }

    static int fun(int num) {
        int sum = num;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}