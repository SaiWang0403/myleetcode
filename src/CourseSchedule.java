import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    @Test
    public void test(){
        int numCources=2;
        int[][] pre={{1,0},{0,1}};
        boolean res=canFinish(numCources,pre);
        System.out.println(res);

    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>(numCourses);
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] preReqRequired = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int preReq = prerequisites[i][1];
            adj.get(preReq).add(prerequisites[i][0]);
            preReqRequired[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(preReqRequired[i]==0){
                queue.add(i);
            }
        }
        List<Integer> topoOrder = new ArrayList<>();
        while(!queue.isEmpty()){
            int curr = queue.poll();
            topoOrder.add(curr);
            for(int i=0;i<adj.get(curr).size();i++){
                preReqRequired[adj.get(curr).get(i)]--;
                if(preReqRequired[adj.get(curr).get(i)]==0){
                    queue.add(adj.get(curr).get(i));
                }
            }
        }
        if(topoOrder.size() == numCourses) {
            return true;
        }

        return false;

    }

}
