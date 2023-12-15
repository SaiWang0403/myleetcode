import org.junit.Test;
//111
//最先深度是从根节点到离他最近的叶子节点的最短路径上的节点数量
//深度优先 就是把 最后的每个子节点的深度看成1，然后递归往上返回 ， 比较上层的节点下面的左右两个节点的深度， 取最小的那个深度
public class MinmunDepthOfBinaryTree {

    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5,new TreeNode(8),null)),new TreeNode(3,new TreeNode(6,new TreeNode(7),null),null));
        System.out.println(minDepth(treeNode));
    }

    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        //关键就是每层设定一个 min （integer的最大值）
        //到每个节点是 会先判断该节点的左子树的最小值 和这层的min（integer的最大值） 比较，必然取该左节点的左子树最小值赋值给min
        //这层min变成了左子树最小值， 算右子树的时候就拿右子树的最小数和这时候的min 比 ，比完后min就必然是该节点下面的子树的最小深度
        // 再把该节点+1 返回 这样上层的节点就知道这时候他 （刚才返回上来的）左或是右节点的最小深度
        int min=Integer.MAX_VALUE;
        if(root.left !=null){
            min=Math.min(minDepth(root.left),min);
        }
        if(root.right!=null){
            min=Math.min(minDepth(root.right),min);
        }
        return min+1;
    }
}
