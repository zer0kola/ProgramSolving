import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
             st = new StringTokenizer(br.readLine());
             points[i][0] = Integer.parseInt(st.nextToken());
             points[i][1] = Integer.parseInt(st.nextToken());
        }
        /*
        Arrays.sort(points, new Comparator<int[]>() {
	    @Override
	    public int compare(int[] point1, int[] point2) {
		    if(point1[0] == point2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
			    return point1[1] - point2[1];
		    }
		    else {
			    return point1[0] - point2[0];
		    }
	    }
    });
         */
        Arrays.sort(points, (point1, point2) -> {
            if(point1[0] == point2[0]) {
                return point1[1] - point2[1]; // x 좌표가 같다면 y 좌표끼리 비교
            } else {
                return point1[0] - point2[0];
            }
        });

        for(int i = 0; i < n; i++) {
            sb.append(points[i][0]).append(' ').append(points[i][1]).append('\n');
        }
        System.out.println(sb);

    }
}