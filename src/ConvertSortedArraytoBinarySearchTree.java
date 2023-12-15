import org.junit.Test;

public class ConvertSortedArraytoBinarySearchTree {
//108
    @Test
    public void test(){
        int[] arr={1,2,3,4,5,6,7};
        TreeNode res=sortedArrayToBST(arr);
        System.out.println(res);

    }


    public TreeNode sortedArrayToBST(int[] nums) {
            return  build(nums,0,nums.length-1);
    }

    TreeNode build(int[] nums,int l,int r){
            if(l>r){
                return null;
            }
            int mid=l+(r-l)/2;
            TreeNode root=new TreeNode(nums[mid]);
            root.left=build(nums,l,mid-1);
            root.right=build(nums,mid+1,r);
            return root;
    }
}
