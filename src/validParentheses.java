import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;

import java.util.Stack;
//20
public class validParentheses {

    @Test
    public void test(){
        String s="([])";
        System.out.println(validpartenthese2(s));
    }

    public boolean validpartenthese(String s){
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            if('('==s.charAt(i)){
                stack.push(')');
            }
            else if('['==s.charAt(i)){
                stack.push(']');
            }
            else if('{'==s.charAt(i)){
                stack.push('}');
            } else if (!stack.isEmpty()){
                Character pop =stack.pop();
                char c=s.charAt(i);
                if(  c!=pop){
                    return false;
                }
            }
            //输入abc
            else {
                return false;
            }
        }
        return stack.isEmpty();

    }


    public boolean validpartenthese2(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if(c=='['){
                stack.push(']');
            }
            else if(c=='{'){
                stack.push('}');
            }
            else if(stack.isEmpty() || stack.pop() !=c){
               return false;
            }
        }
        return stack.isEmpty();

    }
}
