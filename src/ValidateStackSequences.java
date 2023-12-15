import org.junit.Test;
//946
import java.util.Stack;

public class ValidateStackSequences {
    @Test
    public void test(){
        int[] pushed={1,2,3,4,5};
        int[] popped={4,5,3,2,1};
        boolean res=validateStackSequences(pushed,popped);
        System.out.println(res);
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>(); // Create a stack

        int j = 0; // Intialise one pointer pointing on popped array

        for(int val : pushed){
            st.push(val); // insert the values in stack
            while(!st.isEmpty() && st.peek() == popped[j]){ // if st.peek() values equal to popped[j];
                st.pop(); // then pop out
                j++; // increment j
            }
        }
        return st.isEmpty(); // check if stack is empty return true else false
    }
}
