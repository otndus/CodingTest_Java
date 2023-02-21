import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] stack = new int[n];

        int idx = 0;
        int start = 0;

        while(n-- > 0){
            int value = Integer.parseInt(br.readLine());
            if(value > start){
                for(int i=start+1; i<=value; i++){
                    stack[idx] = i;
                    idx++;
                    sb.append('+').append('\n');
                }
                start = value;
            }

            else if(value != stack[idx-1]){
                System.out.println("NO");
                System.exit(0);
            }
            idx--;
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}