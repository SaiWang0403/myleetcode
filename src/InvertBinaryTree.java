import org.junit.Test;
//226
public class InvertBinaryTree {
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,null,new TreeNode(2,new TreeNode(3,new TreeNode(4),null),null));
//        TreeNode treeNode=new TreeNode(1);
        System.out.println(invertTree(treeNode));
    }

    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        return root;

    }
}
