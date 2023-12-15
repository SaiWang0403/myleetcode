import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthese {

    @Test
    public void test(){
        int n=3;
        List<String> res=generateParenthesis(n);
        System.out.println(res);
    }

//回溯  先按顺序走一条路， 走完后 会往前返回走， 如果返回的路上有满足条件的路 就会从那个岔道口往后走，这样所有满足条件的路都能走
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(n,0,0,new StringBuilder());
        return res;
    }
    public void backtrack(int n,int left,int right,StringBuilder sb){
        if(left==n && right==n){
            res.add(new StringBuilder(sb).toString());
        }
        if(left <n){
            sb.append('(');
            backtrack(n,left+1,right,sb);
            sb.deleteCharAt(sb.length()-1);
        }

        if(right<left){
            sb.append(')');
            backtrack(n,left,right+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
