import org.junit.Test;

import java.util.Arrays;
//88
public class mergeSortedArray {

@Test
public void test(){
    int[] nums1= {7,8,9,0,0,0};
    int[] nums2={4,5,6};
    int m=3;
    int n=3;
    merge3(nums1,m,nums2,n);
    System.out.println(Arrays.toString(nums1));


}
  ;

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<nums2.length;i++){
            nums1[m++]=nums2[i];
        }
        Arrays.sort(nums1);


    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n;
        int[] temp=new int[k];
        for (int index=0, nums1Index=0,nums2Index=0;index<k;index++){
            if(nums1Index>=m){
                temp[index]=nums2[nums2Index++];
            }
            else if(nums2Index>=n){
                temp[index]=nums1[nums1Index++];
            }
            else if(nums1[nums1Index]<nums2[nums2Index]){
                temp[index]=nums1[nums1Index++];
            }
            else if(nums2[nums2Index]<nums1[nums1Index]){
                temp[index]=nums2[nums2Index++];
            }
        }
            for (int i=0;i<k;i++){
                nums1[i]=temp[i];
            }

    }

    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n;

        for (int index=k-1, nums1Index=m-1,nums2Index=n-1;index>=0;index--){
            if(nums1Index<0){
                nums1[index]=nums2[nums2Index--];
            }
            else if(nums2Index<0){
                break;
            }
            else if(nums1[nums1Index]>nums2[nums2Index]){
                nums1[index]=nums1[nums1Index--];
            }
            else if(nums2[nums2Index]>nums1[nums1Index]){
                nums1[index]=nums2[nums2Index--];
            }
        }


    }
}
