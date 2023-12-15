import org.junit.Test;
//1046
import java.util.Collections;
import java.util.PriorityQueue;
//1046
public class LastStoneWeight {
    @Test
    public void test(){
        int[] arr={2,7,4,1,8,1};
        int res=lastStoneWeight(arr);
        System.out.println(res);
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while (maxHeap.size() != 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            maxHeap.offer(Math.abs(stone1 - stone2));
        }
        return maxHeap.poll();
    }
}
