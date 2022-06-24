import java.io.*;

public class Main {

    static long[] tri = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        tri[0] = tri[1] = tri[2] = tri[3] = 1;
        tri[4] = tri[5] = 2;
        for (int i = 6; i < tri.length; i++) {
            tri[i] = tri[i - 1] + tri[i - 5];
        }
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(tri[n]);
        }
    }
}