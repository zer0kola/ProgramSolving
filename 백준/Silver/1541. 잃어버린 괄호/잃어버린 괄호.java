import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("-");
        int answer = 0;
        for (int i = 0; i < arr.length ; i++) {
            int temp = sumStr(arr[i]);
            if (i == 0) answer += temp;
            else answer -= temp;
        }
        System.out.println(answer);
    }
    static int sumStr(String str){
        int sum = 0;
        String[] temp = str.split("[+]"); // + 는 []로 감싸줘야 함
        for (int i = 0; i < temp.length ; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}