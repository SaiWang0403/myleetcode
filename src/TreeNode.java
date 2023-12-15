public class TreeNode {

    int val;
      TreeNode left;
      TreeNode right;

      int depth;

      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
    }
}
