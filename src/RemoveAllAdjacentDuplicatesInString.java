import org.junit.Test;

import java.util.Stack;
//1047
public class RemoveAllAdjacentDuplicatesInString {
    @Test
    public void test(){
        String s="abbaca";
        String res=removeDuplicates(s);
        System.out.println(res);
    }

    public String removeDuplicates(String s) {
        if(s.length() == 1){
            return s;
        }

        Stack<Character> stk = new Stack<>();

        for(char c: s.toCharArray()){
            if(stk.isEmpty()){ //empty stack push
                stk.push(c);
            }
            else if(stk.peek() == c){ // two chars are the same
                stk.pop();
            }
            else{ //dif char to last so append
                stk.push(c);
            }
        }

        //return the stack as a string
        StringBuilder ret = new StringBuilder();
        for(char c: stk){
            ret.append(c);
        }

        return ret.toString();
    }
}
