import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[1001];

        // Counting Sort
        // 입력받은 수를 index로 하는 배열의 값 1증가
        for(int i=0; i<N; i++){
            arr[Integer.parseInt(st.nextToken())]++;
        }

        int sum = 0; // 현재 총 누적합
        int prev = 0; // 이전까지의 누적합

        for(int i=0; i<1001; i++){
            while(arr[i]-- > 0){
                sum += (i+prev);
                prev += i;
            }
        }
        System.out.println(sum);
    }
}