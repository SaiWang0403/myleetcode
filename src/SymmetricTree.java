import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

//101
public class SymmetricTree {

    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(3)),new TreeNode(2,new TreeNode(3),new TreeNode(4)));
        System.out.println(isSymmeticTree2(treeNode));
    }
    public boolean isSymmeticTree(TreeNode root){
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        TreeNode u=root.left;
        TreeNode v=root.right;
        if(root==null || (u==null&& v==null)){
            return true;
        }
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()){
            u=q.poll();
            v=q.poll();
            if(u==null && v==null){
                continue;
            }
            if((u==null|| v==null)||(u.val!=v.val)){
                return false;
            }
            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }
        return true;
    }

    public boolean isSymmeticTree2(TreeNode root){
        if(root==null){
            return true;
        }
        return deepCheck(root.left,root.right);
    }
    boolean deepCheck(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.val!= right.val){
            return false;
        }
        return deepCheck(left.left,right.right)&& deepCheck(left.right,right.left);
    }
}
