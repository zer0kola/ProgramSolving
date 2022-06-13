import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        String input = br.readLine();
        char tmp;
        for (int i = 0; i < input.length(); i++) {    //문자열을 검사하기 위해서 input의 길이만큼 반복문 실행(한글자씩 tmp에 옮겨서 검사)
            tmp = input.charAt(i);    //문자열을 한글자씩 tmp에 넣는다.
            if ((65 <= tmp) && (tmp <= 90)) {    //문자가 65 <= tmp <= 90인 경우 (대문자인 경우)
                output.append(input.valueOf(tmp).toLowerCase());    //내장함수를 이용해서 소문자로 변환
            } else if ((97 <= tmp) && (tmp <= 122)) { //문자가 97 <= tmp <= 122인 경우 (소문자인 경우)
                output.append(input.valueOf(tmp).toUpperCase());    //내장함수를 이용해서 대문자로 변환
            }
        }
        System.out.println(output);
    }
}