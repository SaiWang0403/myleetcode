import org.junit.Test;

import java.util.*;
//15
public class ThreeSum {

    @Test
    public void test(){
        int[] arr={0-1,0,1,2,-1,-4};
        List<List<Integer>> res=threeSum2(arr);
        System.out.println(res);
    }

//a[i]第一个数   a[j] 左指针 a[k] 右指针
    // 判断 a+b+c 是不是等于0 可以

    public List<List<Integer>> threeSum2(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;

            while (j < k) {
                int sum=a[i]+a[j]+a[k];
                if (sum<0) j++;
                else if (sum>0) k--;
                else {
                    res.add(Arrays.asList(a[i], a[j], a[k]));
                    while (j < k && a[j + 1] == a[j]) j++;
                    j++;
                }
            }

            while (i + 1 < n && a[i] == a[i + 1]) i++;
        }

        return res;
    }

}
