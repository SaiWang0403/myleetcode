import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {


    @Test
    public void test(){
        int rowIndex=3;
        List<Integer> res=getRow(rowIndex);
        System.out.println(res);
    }


    public List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<Integer>();
        ret.add(1);
        for(int i = 1; i <= rowIndex; i++){
            for(int j =i-1; j >=1; j--){
                int tmp = ret.get(j - 1) + ret.get(j);
                ret.set(j, tmp);
            }
            ret.add(1);
        }
        return ret;
    }


}
