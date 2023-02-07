import java.io.*;
import java.util.*;

public class Main {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        StringTokenizer st;

        while(N-- > 0){
            st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }

    static void push(int X){
        stack[size] = X;
        size++;
    }

    static int pop(){
        if(size <= 0) return -1;
        else{
            int temp = stack[size-1];
            size--;
            return temp;
        }
    }

    static int size(){
        return size;
    }

    static int empty(){
        if(size <= 0)
            return 1;
        else
            return 0;
    }

    static int top(){
        if(size <= 0) return -1;
        else{
            return stack[size-1];
        }
    }
}
