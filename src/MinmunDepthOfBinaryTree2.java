import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class MinmunDepthOfBinaryTree2 {
    //111
    //广度优先  就是把最初的root节点 看成1， 当发现如果当前节点没有左右子树节点时候 返回 当前节点的depth
    //因为 需要改TreeNode 的源代码 所以不能在LeetCode里用

    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5,new TreeNode(8),null)),new TreeNode(3,new TreeNode(6,new TreeNode(7),null),null));
        System.out.println(minDepth(treeNode));
    }

    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
//需要个Queue 因为需要取到每一层的所有节点，把这一层的所有节点放入queue中 然后下一次循环时候 就会取到第一个上次放入的节点（最左面） 取到后直接poll出去 然后赋值给node 并进行操作
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        root.depth=1;
        //先放1
        queue.offer(root);

        while (!queue.isEmpty()){
            //开始时直接取出第一个queue里 第一个节点（先进先出） 并进行操作
            TreeNode node =queue.poll();
            if(node.left ==null && node.right==null){
                return node.depth;
            }
//如果当前节点有左节点那么 把这个左节点的depth 变成 之前节点的depth+1， 然后把这个左节点放入queue
            //下次循环就会发现queue里有这个节点 并操作
            if(node.left!=null){
                node.left.depth=node.depth+1;
                queue.offer(node.left);
            }
            if(node.right!=null){
                node.right.depth=node.depth+1;
                queue.offer(node.right);
            }
        }
        return  0;
    }
}
