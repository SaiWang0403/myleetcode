import org.junit.Test;
//501
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindModeinBinarySearchTree {
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,null,new TreeNode(2,new TreeNode(2),null));
        int[] res=findMode(treeNode);
        for (int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }

    }

    int maxCount = 1;
    public int[] findMode(TreeNode root) {

        Map<Integer, Integer> map = new HashMap<>();
        findMode(root, map);

        int[] result = new int[map.size()];
        int index = 0;
        for(Integer key: map.keySet()){
            if(map.get(key) == maxCount){
                result[index++] = key;
            }
        }

        return Arrays.copyOf(result, index);
    }

    private void findMode(TreeNode root, Map<Integer, Integer> map){
        if(root == null) {
            return;
        } else if(map.containsKey(root.val)) {
            map.put(root.val, map.get(root.val)+1);
            maxCount = Math.max(maxCount, map.get(root.val));
        } else {
            map.put(root.val, 1);
        }

        findMode(root.left, map);
        findMode(root.right, map);
    }
}
