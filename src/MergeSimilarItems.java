import org.junit.Test;
//2363
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class MergeSimilarItems {
    @Test
    public void test(){
        int[][] items1={{1,1},{4,5},{3,8}};
        int[][] items2={{3,1},{1,5}};
        List<List<Integer>> list=new ArrayList<>();
        list=mergeSimilarItems(items1,items2);
        System.out.println(list);
    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<items1.length;i++){
            map.put(items1[i][0],items1[i][1]);
        }
        for(int i=0;i<items2.length;i++){
            if(map.containsKey(items2[i][0])){
                int v=map.get(items2[i][0]);
                v+=items2[i][1];
                map.put(items2[i][0],v);
            }else{
                map.put(items2[i][0],items2[i][1]);
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int k:map.keySet()){
            List<Integer> temp=new ArrayList<>();
            temp.add(k);
            temp.add(map.get(k));
            list.add(temp);
        }
        return list;

    }
}
