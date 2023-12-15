import org.junit.Test;

public class SumRoottoLeafNumbers {
    //129

    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        int res=sumNumbers(treeNode);
        System.out.println(res);

    }

    int ans=0;
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return ans;
    }

    public void dfs(TreeNode root,int num){
        num=num*10 +root.val;
        if(root.left==null && root.right==null){
            ans=ans+num;
            return;
        }
        if(root.left!=null){
            dfs(root.left,num);
        }
        if(root.right!=null){
            dfs(root.right,num);
        }
    }
}
