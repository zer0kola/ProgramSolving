import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean primes[] = new boolean[n+1]; // 기본 false로 초기화

        primes[0] = true; // true 는 소수가 아님
        primes[1] = true; // false 는 소수임
        // 수를 나열한 다음 2의 배수, 3의 배수, ... 루트 n의 배수를 제외하면 남은 건 소수뿐
        for(int i=2; i<=Math.sqrt(n+1); i++) {
            for(int j=i*i; j<n+1; j+=i) { 
                primes[j] = true; // i를 늘려가며 배수를 지워나감
            }
        }

        for(int i=m; i<n+1; i++) {
            if(primes[i] == false)
                System.out.println(i);
        }
    }
}