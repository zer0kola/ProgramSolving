import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < in.length(); i++) {

            if (65 <= in.charAt(i) && in.charAt(i) <= 90) { // 대문자 범위
                arr[in.charAt(i) - 65]++;	// 해당 인덱스의 값 1 증가
            }
            else {	// 소문자 범위
                arr[in.charAt(i) - 97]++;
            }
        }
        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}