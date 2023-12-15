import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
// 797 所有可能的路径
public class AllPathFromSourcetoTarget {

    @Test
    public void test(){
//        List<List<Integer>> arr=new ArrayList<>();
//        List<Integer> innerList = new ArrayList<>();
//
//        innerList.add(1);
//        innerList.add(2);
//
//        List<Integer> innerList2 = new ArrayList<>();
//        innerList2.add(3);
//
//        List<Integer> innerList3 = new ArrayList<>();
//        innerList3.add(3);
//
//        List<Integer> innerList4 = new ArrayList<>();
//
//        arr.add(innerList);
//        arr.add(innerList2);
//        arr.add(innerList3);
//        arr.add(innerList4);
      int[][] arr={{1,2},{3},{3},{}};
        List<List<Integer>> res=allPathsSourceTarget(arr);
        System.out.println(res);

    }

    List<List<Integer>> res=new ArrayList<>();
    List<Integer> list =new ArrayList<>();


    int n;

    //dfs 回溯
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
             n=graph.length;
            backtrack(graph,0);
            return res;
    }

    public void backtrack(int[][] graph, int start){
        list.add(start);

        if(start==n-1){
            res.add(new ArrayList<Integer>(list));
        }
        else {
            // int[][] arr={{1,2},{3},{3},{}};
            //graph[0] 的neighbor就是1,2 要loop这两个点 再找这两个点的每个点的neighbor
            for (int neighbor : graph[start]){
                backtrack(graph,neighbor);
            }
        }
//回溯
        list.remove(list.size()-1);
    }
}
