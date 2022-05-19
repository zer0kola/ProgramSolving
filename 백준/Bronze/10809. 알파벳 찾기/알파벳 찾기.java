import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int[] alphabet = new int[26];
        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }
        String S = br.readLine();
        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if(alphabet[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
                alphabet[ch - 'a'] = i;
            }
        }

        for(int val : alphabet) {	// 배열 출력
            sb.append(val).append(' ');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}