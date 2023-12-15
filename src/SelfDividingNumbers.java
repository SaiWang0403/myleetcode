import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
//728
    @Test
    public void test(){
        int left=1;
        int right=22;
        List<Integer> res=selfDividingNumbers(left,right);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }

    }


    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<>();

        while(left<=right){
            if(check(left)){
                res.add(left);
            }
            left++;
        }
        return res;
    }

    public boolean check(int left){
        int x=left;
        while(left!=0){
            int rem=left%10;
            if(rem==0){
                return false;
            }
            if(x%rem!=0){
                return false;
            }
            left=left/10;
        }
        return true;
    }
}
