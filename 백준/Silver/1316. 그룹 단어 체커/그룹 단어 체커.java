import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];
        int count = 0;
        for (int i = 0; i < num ; i++) {
            arr[i] = br.readLine();
        }

        for (String i : arr) {
            if (check(i)) count ++;
        }

        System.out.println(count);
    }
    static boolean check (String str){
        boolean[] check = new boolean[26];
        int prev = 0;
        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)

            if (prev != now) {// 앞선 문자와 i 번째 문자가 같지 않다면?

                if ( check[now - 'a'] == false ) { // 해당 문자가 처음 나오는 경우 (false 인 경우)
                    check[now - 'a'] = true;		// true 로 바꿔준다
                    prev = now;					// 다음 턴을 위해 prev 도 바꿔준다
                }

                else {// 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                    return false;	//함수 종료
                }
            }

        }
        return true;
    }
}