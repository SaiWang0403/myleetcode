import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//56
public class MergeIntervals {

    @Test
    public void test(){
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        int[][] res=merge(intervals);

        for (int i=0;i<res.length;i++){
            for (int j=0;j<res[i].length;j++){
                System.out.println(res[i][j]);
            }
        }

    }

    public int[][] merge(int[][] intervals) {
        if(intervals==null || intervals.length<1 || intervals[0].length <1){
            return new int[0][0];
        }
        Arrays.sort(intervals,(x,y)->x[0]-y[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        List<int[]> list=new ArrayList<>();
        for (int i=0; i< intervals.length;i++){
            if(intervals[i][0] >end){
                list.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
            else {
                end=Math.max(end,intervals[i][1]);
            }
        }
        list.add(new int[]{start,end});
        int[][] res= new int[list.size()][2];
        for (int i=0; i<list.size();i++){
            res[i][0]= list.get(i)[0];
            res[i][1]=list.get(i)[1];
        }
        return res;
    }
}
