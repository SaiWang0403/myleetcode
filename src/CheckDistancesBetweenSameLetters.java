import org.junit.Test;
//2399
import java.util.HashMap;

public class CheckDistancesBetweenSameLetters {

    @Test
    public void test(){
        String s="abaccb";
        int[] d= {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        boolean res=checkDistances(s,d);
        System.out.println(res);
    }

    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int res=i-map.get(s.charAt(i))-1;
                if(res!=distance[s.charAt(i)-97]){
                    return false;
                }
                continue;
            }
            map.put(s.charAt(i),i);
        }
        return true;
    }
}
