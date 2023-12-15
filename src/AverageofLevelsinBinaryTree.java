import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//637
public class AverageofLevelsinBinaryTree {
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        List<Double> res=new ArrayList<>();
        res=averageOfLevels(treeNode);
        System.out.println(res);
    }


    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averageOfLevels = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                sum += curr.val;
                if (curr.left != null)  queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
            averageOfLevels.add((double) sum / size);
        }

        return averageOfLevels;
    }
}
