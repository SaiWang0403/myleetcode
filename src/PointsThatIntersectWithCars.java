import org.junit.Test;
//2848
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PointsThatIntersectWithCars {
    @Test
    public void test(){
        List<List<Integer>> nums=new ArrayList<>();
        ArrayList list1=new ArrayList<>();
        ArrayList list2=new ArrayList<>();
        ArrayList list3=new ArrayList<>();
        list1.add(3);
        list1.add(6);
        list2.add(1);
        list2.add(5);
        list3.add(4);
        list3.add(7);
        nums.add(list1);
        nums.add(list2);
        nums.add(list3);
        int res=numberOfPoints(nums);
        System.out.println(res);
    }

    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.size();i++){
            int left=nums.get(i).get(0);
            int right=nums.get(i).get(1);
            while(left<=right){
                set.add(left);
                left++;
            }
        }
        return set.size();
    }
}
