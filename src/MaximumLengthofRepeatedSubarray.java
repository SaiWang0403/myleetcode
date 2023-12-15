import org.junit.Test;
//718
public class MaximumLengthofRepeatedSubarray {
    @Test
    public void test(){
        int[] nums1={1,2,3,2,1};
        int[] nums2={3,2,1,4,7};
        int res=findLength(nums1,nums2);
        System.out.println(res);
    }

    public int findLength(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        int ans=0;
        int dp[][]= new int[n+1][m+1];

        for(int i=1;i<=n;i++)
            for(int j=1;j<=m;j++){

                if(nums1[i-1]==nums2[j-1] ){
                    dp[i][j]= 1+ dp[i-1][j-1];
                    ans=Math.max (ans,dp[i][j] );
                }
                else dp[i][j]=0;
            }
        return ans;
    }
}
