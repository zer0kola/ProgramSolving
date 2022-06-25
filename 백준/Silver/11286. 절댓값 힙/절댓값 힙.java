import java.util.*;
import java.io.*;

public class Main {
    static int[] arr = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> absHeap = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1)>Math.abs(o2)) {
                    return 1; //변경
                    //절대값이 같으면 작은수를 먼저
                }else if(Math.abs(o1)==Math.abs(o2)) {
                    return o1-o2;
                }else {
                    return -1;
                }
            }
        });
        for (int i = 0; i < t ; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n==0 && absHeap.size()!=0) {
                System.out.println(absHeap.poll());
            }else if(n==0 && absHeap.size()==0) {
                System.out.println(0);
            }else {
                absHeap.add(n);
            }
        }
    }
}