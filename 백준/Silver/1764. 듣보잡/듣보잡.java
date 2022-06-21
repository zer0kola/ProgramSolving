import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            hashSet.add(br.readLine());
        }
        for (int i = 0; i < m ; i++) {
            String name = br.readLine();
            if(hashSet.contains(name)){
                list.add(name);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (String s : list){
            System.out.println(s);
        }
    }
}