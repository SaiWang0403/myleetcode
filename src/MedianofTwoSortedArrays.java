import org.junit.Test;

public class MedianofTwoSortedArrays {
    @Test
    public void test(){
        int[] nums1={1,2};
        int[] nums2={3,4};
        double res=findMedianSortedArrays(nums1,nums2);
        System.out.println(res);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        return (getK(nums1,nums2,0,m-1,0,n-1,(m+n+1)/2)
                +getK(nums1,nums2,0,m-1,0,n-1,(m+n+2)/2)
                )*0.5;
    }

    public int getK(int[] nums1,int[] nums2, int l1, int r1, int l2,int r2,int k){
        int len1=r1-l1+1;
        int len2=r2-l2+1;
        if(len1>len2){
            return getK(nums2,nums1,l2,r2,l1,r1,k);
        }
        if(len1==0){
            return nums2[l2+k-1];
        }
        if(k==1){
            return Math.min(nums1[l1],nums2[l2]);
        }
        int idx1=l1+Math.min(len1,(k/2))-1;
        int idx2=l2+Math.min(len2,(k/2))-1;
        if(nums1[idx1]>nums2[idx2]){
            return getK(nums1,nums2,l1,r1,idx2+1,r2,k-(idx2-l2+1));
        }
        return getK(nums1,nums2,idx1+1,r1,l2,r2,k-(idx1-l1+1));
    }

}
