import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
//412
public class FizzBuzz {

    @Test
    public void test(){
        int n=3;
        List<String> res=fizzBuzz(n);
        System.out.println(res);
    }

    public List<String> fizzBuzz(int n) {
        List<String> list= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                list.add("FizzBuzz");
                continue;
            }
            if(i%3==0){
                list.add("Fizz");
                continue;
            }
            if(i%5==0){
                list.add("Buzz");
                continue;
            }

            String s=i+"";
            list.add(s);
        }
        return list;
    }
}
