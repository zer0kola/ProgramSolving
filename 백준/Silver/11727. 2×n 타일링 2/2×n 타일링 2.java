import java.io.*;

public class Main {
    static int[] arr = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr[1] = 1;
        arr[2] = 3;
        for (int i = 3; i < 1001; i++) {
            arr[i] = (arr[i - 1] + 2 * arr[i - 2]) % 10007;
        }
        System.out.println(arr[n]);
    }
}
