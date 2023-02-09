import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();

        for(int i=1; i<=num; i++){
            q.add(i);
        }

        while(q.size() != 1){
            q.poll();
            q.addLast(q.poll());
        }
        System.out.println(q.peek());
    }
}
