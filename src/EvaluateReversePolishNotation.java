import org.junit.Test;
//150
import java.util.Stack;

public class EvaluateReversePolishNotation {
    @Test
    public void test(){
        String[] tokens={"2","1","+","3","*"};
        int res=evalRPN(tokens);
        System.out.println(res);
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int second=stack.pop();
                int first=stack.pop();
                stack.push(Integer.valueOf(first+second));
            }else if(tokens[i].equals("-")){
                int second=stack.pop();
                int first=stack.pop();
                stack.push(Integer.valueOf(first-second));
            }else if(tokens[i].equals("*")){
                int second=stack.pop();
                int first=stack.pop();
                stack.push(Integer.valueOf(first*second));
            }else if(tokens[i].equals("/")){
                int second=stack.pop();
                int first=stack.pop();
                stack.push(Integer.valueOf(first/second));
            }else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
