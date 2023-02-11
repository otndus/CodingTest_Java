import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N= Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            sb.append(check(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }
    static String check(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){

            char c = str.charAt(i);

            if(c == '('){
                stack.push(c);
            }

            else if(stack.empty()){
                return "NO";
            }

            else{
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}