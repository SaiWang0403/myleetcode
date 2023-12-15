import org.junit.Test;

public class PathSum {

    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3,new TreeNode(6,new TreeNode(7),null),null));

        boolean res=hasPathSum(treeNode,17);
        System.out.println(res);
    }


    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }

        if(root.left==null && root.right==null){
            return root.val==targetSum;
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);

    }
}
