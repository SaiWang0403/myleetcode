import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
//1346
public class CheckIfNandItsDoubleExist {
    @Test
    public void test(){
        int[] arr={10,2,5,3};
        boolean res=checkIfExist(arr);
        System.out.println(res);
    }

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for(int num : arr){
            if(num%2==0 && set.contains(num/2))return true;
            if(set.contains(num*2))return true;
            set.add(num);
        }
        return false;
    }
}
