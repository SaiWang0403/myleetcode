import org.junit.Test;
//2418
import java.util.Arrays;
import java.util.HashMap;

public class SortthePeople {
    @Test
    public void test(){
        String[] names={"mary","john","emma"};
        int[] heights={180,165,170};
        String[] res=sortPeople(names,heights);
        for (int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        String[] res=new String[heights.length];

        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);

        }

        Arrays.sort(heights);
        int index=0;
        for(int i=heights.length-1;i>=0;i--){
            res[index++]=map.get(heights[i]);
        }
        return res;
    }
}
