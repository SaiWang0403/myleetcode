import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//13
public class Romantoint {

    @Test
    public void test(){
        String s="IV";
        System.out.println(romanToInt(s));

    }

    public int romanToInt(String s) {
        Map<String, Integer> map=new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("p",0);   // this is just dummy
        s="p"+s;
        int len=s.length(), sum=0;
        int i=len-1;
        while(i>0){
            char char1=s.charAt(i);
            char char2=s.charAt(i-1);
            if(map.get(char1+"")>map.get(char2+"")){
                sum=sum-map.get(char2+"")+map.get(char1+"");
                i=i-2;
            }
            else{
                sum+=map.get(char1+"");
                i=i-1;
            }

        }
        return sum;
    }
}
