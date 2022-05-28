import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int sum = 0;
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }
        Arrays.sort(numbers);

        boolean flag = false;
        int modeMax = 0;
        int mode = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            int jump = 0;
            int modeCount = 1;
            int current = numbers[i];

            for (int j = i + 1; j < count; j++) {
                if (current != numbers[j]) break;
                modeCount++; // 두 개 이상 연속하면
                jump++;
            }

            if (modeCount > modeMax) {
                modeMax = modeCount;
                mode = current;
                flag = true; // 최빈값이 중복되지 않을 때
            } else if (modeCount == modeMax && flag == true) {
                mode = current;
                flag = false;
            }

            i += jump; // 같은 값이 나온 만큼 점프
        }

        System.out.println((int) Math.round((double) sum / count));
        System.out.println(numbers[count / 2]);
        System.out.println(mode);
        System.out.println(numbers[count - 1] - numbers[0]);
    }
}