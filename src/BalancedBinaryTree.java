import org.junit.Test;

//110
public class BalancedBinaryTree {

    @Test
    public void test(){
//        TreeNode treeNode=new TreeNode(1,null,new TreeNode(2,new TreeNode(3,new TreeNode(4),null),null));
        TreeNode treeNode=new TreeNode(1,new TreeNode(2),null);
        System.out.println(balancedBinaryTree(treeNode));
    }

    public boolean balancedBinaryTree(TreeNode root) {
            if(root ==null){
                return true;
            }
//        System.out.println(helper(root));
            return helper(root)!=-1;
    }

    private int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        if(left==-1||right==-1||Math.abs(left-right)>1){
                return -1;
        }
        return Math.max(left,right)+1;
    }

}
