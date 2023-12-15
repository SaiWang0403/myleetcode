import org.junit.Test;
//649
import java.util.LinkedList;
import java.util.Queue;

public class DotaPredictPartyVictory {

    @Test
    public void  test(){
        String senate="RDRDD";
        String res=predictPartyVictory(senate);
        System.out.println(res);
    }

//RDRDD 是R方赢
    //关键就是 R方 第一个R 一定要把 D方第一个D投死（这样R方会剩下两个 D方会剩下一个人）   如果投的是别的D 那么会输（因为D方第一个D会把第二个R投死，那么就变成R方还剩一个人 D方还剩两个）

    public String predictPartyVictory(String senate) {
        Queue<Integer> r=new LinkedList();
        Queue<Integer> d=new LinkedList();
        int length=senate.length();
        for (int i=0;i<length;i++){
            if(senate.charAt(i)=='R'){
                r.offer(i);
            }else {
                d.offer(i);
            }
        }

        while (!r.isEmpty() && !d.isEmpty()){
            int rPoll=r.poll();
            int dPoll=d.poll();
            //所以贪心算法 取局部最优
            if(rPoll <dPoll){
                r.offer(rPoll+length);
            }else {
                d.offer(dPoll+length);
            }
        }
        return  d.isEmpty() ? "Radiant" : "Dire";
    }
}
