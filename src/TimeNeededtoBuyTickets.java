import org.junit.Test;
//2073
import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededtoBuyTickets {
    @Test
    public void test(){
        int[] tickets={2,3,2};
        int k=2;
        int res=timeRequiredToBuy(tickets,k);
        System.out.println(res);
    }

    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int ans = 0;
        for(int i = 0; i < tickets.length; i++){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            int index = queue.poll();
            tickets[index]--;
            ans++;
            if(tickets[index] == 0 && index == k){
                return ans;
            }
            if(tickets[index] > 0){
                queue.add(index);
            }
        }
        return ans;
    }
}
