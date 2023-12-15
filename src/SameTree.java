import org.junit.Test;

public class SameTree {

    @Test
    public void test(){
        TreeNode p=new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode q=new TreeNode(1,new TreeNode(2),new TreeNode(3));

        boolean res;
        res=isSameTree(p,q);
        System.out.println(res);
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null && q==null){
                return true;
            }
            if(p==null || q==null ||p.val!=q.val){
                return false;
            }
            return  isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
