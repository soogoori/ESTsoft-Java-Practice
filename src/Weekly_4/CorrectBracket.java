package Weekly_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class CorrectBracket {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            else{
                if(stack.isEmpty()){
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            answer=false;
            System.out.println(answer);
        }
        else System.out.println(answer);
    }
}
