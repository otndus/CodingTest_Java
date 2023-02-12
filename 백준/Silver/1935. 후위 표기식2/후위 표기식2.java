import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] intArr = new int[N];

        for(int i=0; i<N; i++){
            intArr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if('A' <= ch && ch <= 'Z'){
                double d = intArr[ch-'A'];
                stack.push(d);
            }
            else{
                double a = stack.pop();
                double b = stack.pop();

                if(ch == '+'){
                    stack.push(a+b);
                }
                else if(ch == '-'){
                    stack.push(b-a);
                }
                else if(ch == '/'){
                    stack.push(b/a);
                }
                else if(ch == '*'){
                    stack.push(a*b);
                }
            }
        }
        System.out.println(String.format("%.2f", stack.pop()));
    }
}
