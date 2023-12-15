import org.junit.Test;
//2347
import java.util.HashMap;
import java.util.HashSet;

public class BestPokerHand {
    @Test
    public void test(){
        int[] ranks={13,2,3,1,9};
        char[] suits={'a','a','a','a','a'};
        String res=bestHand(ranks,suits);
        System.out.println(res);
    }

    public String bestHand(int[] ranks, char[] suits) {
        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<suits.length;i++){
            set.add(suits[i]);
        }
        if(set.size()==1){
            return "Flush";
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<ranks.length;i++){
            map.put(ranks[i],map.getOrDefault(ranks[i],0)+1);
        }
        int res=0;
        for(Integer v:map.values()){
            if(v>=3){
                res=Math.max(res,v);
            }else if(v==2){
                res=Math.max(res,v);
            }
        }
        if(res>=3){
            return "Three of a Kind";
        }
        if(res==2){
            return "Pair";
        }
        return "High Card";
    }
}
