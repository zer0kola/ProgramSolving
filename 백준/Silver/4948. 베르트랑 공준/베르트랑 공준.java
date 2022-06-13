import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean primes[] = new boolean[246913]; // n+1 칸의 배열 기본 false로 초기화
        primes[0] = true; // true 는 소수가 아님
        primes[1] = true; // false 는 소수임
        // 수를 나열한 다음 2의 배수, 3의 배수, ... 루트 n의 배수를 제외하면 남은 건 소수뿐
        for (int i = 2; i <= Math.sqrt(246913); i++) {
            for (int j = i * i; j < 246913; j += i) {
                primes[j] = true; // i를 늘려가며 배수를 지워나감
            }
        }

        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!primes[i]) count++;
            }
            System.out.println(count);
            n = Integer.parseInt(br.readLine());
        }
    }
}