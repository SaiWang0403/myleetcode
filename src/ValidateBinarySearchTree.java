import org.junit.Test;

public class ValidateBinarySearchTree {
//98
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(2,new TreeNode(1),new TreeNode(3));
        boolean res= isValidBST(treeNode);
        System.out.println(res);
    }

    TreeNode pre=null;
    //直接用中序 排序左中右 先把左面的看成pre 判断他大不大于中间的root。value 如果大那就不行， 然后再把pre改成刚才的root。value 右边的改成root 再判断
    //这样每次就是判断左面大不大于这个左面的右面一位 所以用中序遍历正好
    public boolean isValidBST(TreeNode root) {
            if(root==null){
                return true;
            }
            boolean left=isValidBST(root.left);
            if(pre!=null && pre.val>=root.val){
                return false;
            }
            pre=root;
            boolean right =isValidBST(root.right);
            return left&&right;
    }
}
