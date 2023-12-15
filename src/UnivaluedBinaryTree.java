import org.junit.Test;
//965
public class UnivaluedBinaryTree {
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,new TreeNode(1),new TreeNode(2));
        boolean res=isUnivalTree(treeNode);
        System.out.println(res);
    }

    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return false;
        }
        int num=root.val;

        boolean res=accessTree(num,root);
        return res;
    }

    public boolean accessTree(int num,TreeNode root){
        if(root==null){
            return true;
        }
        if(root.val!=num){
            return false;
        }
       boolean l= accessTree(num,root.left);
       boolean r= accessTree(num,root.right);
       if(l==true &&r==true){
            return true;
       }
        return false;
    }
}
