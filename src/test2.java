import org.junit.Test;

import java.util.*;
//2248
public class test2 {

   @Test
    public void test(){
//       String s="123";
//       for(int i = 0; i<s.length(); i++){
//           System.out.println(s.charAt(i));
//       }

//        char a='1';
//       int b=a-'0';
//       System.out.println(b);

       ArrayList<Integer> res=new ArrayList<>();
       res.add(1);
      res.add(2);
      res.size();
       int[] arr = res.stream().mapToInt(i -> i).toArray();
//       for (int i=0;i<arr.length;i++){
//          System.out.println(arr[i]);
//       }
       System.out.println(arr);
       // int[] 不能直接输出 但char【】 可以 arraylist也可以

       String s="a";
       s.length();

       int[] arr1={1,2};
      int b= arr1.length;



//       int[] arr1={1,2,3};
//      ArrayList<Integer> ans=new ArrayList<>();
//      for(int i=0;i<arr1.length;i++){
//         ans.add(arr1[i]);
//      }
//      System.out.println(ans);

   }




}