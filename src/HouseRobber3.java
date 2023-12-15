import org.junit.Test;

public class HouseRobber3 {
//337
    @Test
    public void test(){


        TreeNode treeNode =new TreeNode(3,new TreeNode(2,null,new TreeNode(3)),new TreeNode(3,null,new TreeNode(1)));

        int res=rob(treeNode);
        System.out.println(res);
    }

    public int rob(TreeNode root) {
            int[] res=dfs(root);
          int ans=  Math.max(res[0],res[1]);
          return ans;
    }

//判断一个节点的最优解 就是判断选不选当前的那个节点
    //如果选了这个节点 （他的子节点就不能选了） 那就要加上 不选子节点的情况   这就是如果选了这个点的最优解
    //如果不选这个节点 那就要先判断左面的 如果选左面这个子节点 和 不选左面子节点 哪个收益多，在判断 如果选右面的子节点 和不选择右面的子节点 哪个收益多
    //所以 如果 不选择右面子节点的话 收益多 那么 就不要选右面子节点了，这时候也不选这个节点， 所以可以连续跳过两个节点
    public int[] dfs(TreeNode root) {
        if(root==null){
            return new int[]{0,0};
        }

        int[] l=dfs(root.left);
        int[] r=dfs(root.right);
        int select=root.val + l[1]+r[1];
        int notselect=Math.max(l[0],l[1])+Math.max(r[0],r[1]);
        return new int[]{select,notselect};
    }
}
