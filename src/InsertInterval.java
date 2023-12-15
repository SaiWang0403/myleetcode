import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    @Test
    public void test(){
        int[][] intervals={{2,4},{7,10}};
        int[] b={3,5};
        int[][] res=insert(intervals,b);
        System.out.println(Arrays.deepToString(res));

    }
//三种情况 1，新数组在老数组右面  把老数组加结果里  2新数组在老数组左面 把老数组加进去 3 新数组一部分或全部在老数组里面 取最小和最大边界

    public int[][] insert(int[][] intervals, int[] b) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        for (; i < intervals.length; i++) {
            int[] a = intervals[i];
            //判断新数组整个是不是在老数组右面 a是老数组 如果是就该把老数组加进去
            if (a[1]<b[0]){
                list.add(a);
            }
            else break;
        }

        list.add(b);
        for (; i < intervals.length; i++) {
            merge(list, intervals[i]);
        }

        int[][] res = new int[list.size()][];
        for (i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }

    void merge(List<int[]> list, int[] old) {
        int[] c= list.get(list.size() - 1);
        //判断新数组是不是在老数组的左面 c是新数组 如果是就把老数组加结果里
        if (c[1]<old[0]) {
            list.add(old);
            return;
        }

        //如果整个新数组既不在老数组右面 也不在老数组左面 说明有重叠
        c[0] = Math.min(c[0], old[0]);
        c[1] = Math.max(c[1], old[1]);
    }
}
