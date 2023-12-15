import org.junit.Test;
//870 田忌赛马
import java.util.*;

public class AdvantageShuffle {

    @Test
    public void test(){
        int[] A= {19,17,14,13,11,9};
        int[] B ={21,20,16,16,12,10};
        int res[]=advantageCount(A,B);
        for (int r:res){
            System.out.println(r);
        }
// 14 9 19 17 13 11
// {21,20,16,16,12,10};

    }

    public int[] advantageCount(int[] nums1, int[] nums2) {
        //nums1是田忌 也是我要改变的数组
        Arrays.sort(nums1);

        int[] sortB=nums2.clone();
        Arrays.sort(sortB);

//        Arrays.sort(nu);

//hashmap  是无序的 不可重复的 所以里面的顺序不用管
        Map<Integer, Deque<Integer>> bMap= new HashMap<>();
        for (int b:nums2){
            bMap.put(b,new LinkedList<>());
        }
        Deque<Integer> aq=new LinkedList<>();
        int j=0;
        for (int a :nums1){
            //比较两个sort过的数组 从前往后比较，
            if(a>sortB[j]){
                //如果sort过的A数组里的第一个比 sort过的B数组的第一个大， 那么说明这个数可以就是最合理的与B比赛的最佳结果，那么把它放进bmap里最小的数的那个位置（.get(sortB[j++]) 就是sort后b数组从前往后）的value
                //这个sort后 b数组的第一个数也就是最小的数 便有了最佳匹配对手
                bMap.get(sortB[j++]).add(a);
            }else {
                //如果这个数比sortB 小 那么把它放进垃圾桶， 让他以后去和大的数比
                aq.add(a);
            }
        }

        int[] ans=new int[nums1.length];
        for (int i=0;i<nums2.length;i++){
            if(bMap.get(nums2[i]).size()>0){
                //如果之前bmap 里存了数 那么说明 这个数有了最佳匹配对手， 要从nums2开始找相对应的数 因为结果是要和nums2比 这样才能一一对应 而不是和sortb 比
                ans[i]=bMap.get(nums2[i]).removeLast();
            }else {
                //如果nums2的这个数 也就是在bmap里没存value 说明他太大了，当时bMap.get(sortB[j++]).add(a) 时候 a都没了 sortb的那个位置的数还没取到
                //这时候就从垃圾桶里找个数 就行了 让a里这个小的数 和B里最大的数比
                ans[i]=aq.removeLast();
            }
        }
        return ans;
    }
}
