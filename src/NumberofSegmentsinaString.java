import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
//434
public class NumberofSegmentsinaString {

    @Test
    public void test(){
        String s="  a   ,  eaefa  ";
        int res=countSegments(s);
        System.out.println(res);
    }


    public int countSegments(String s) {
        if(s == null || s.equals("") )
            return 0;
        List<String> list = new ArrayList<>();
        String[] segs = s.split(" ");
        for(String ss:segs){
            if(!ss.equals("")){
                list.add(ss);

            }
        }
        return list.size();
    }
}
