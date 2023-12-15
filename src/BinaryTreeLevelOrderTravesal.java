import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTravesal {
//层序遍历就是从上往下 从左往右


    @Test
    public void test(){
//        TreeNode treeNode=new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode treeNode=new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
//        TreeNode treeNode=new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5,new TreeNode(8),null)),new TreeNode(3,new TreeNode(6,new TreeNode(7),null),null));

        System.out.println(binaryTreeLevelOrderTravesal(treeNode));
    }

    public List<Integer> binaryTreeLevelOrderTravesal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()){
            TreeNode node=q.poll();
            if (node!=null){
                res.add(node.val);
                q.add(node.left);
                q.add(node.right);
            }
        }
        return res;

    }
}
