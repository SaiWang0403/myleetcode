import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
//257
public class BinaryTreePaths {

    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        List<String> res=binaryTreePaths(treeNode);
        System.out.println(res);
    }

    ArrayList<String> list=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder ans=new StringBuilder();
        path(root,ans);
        return list;
    }
    void path(TreeNode root, StringBuilder ans) {
        if(root==null) return;
        ans=ans.append(root.val);
        if(root.left==null && root.right==null){
            list.add(ans.toString());
            ans.setLength(ans.length() - String.valueOf(root.val).length());
            return;
        }

        ans.append("->");
        path(root.left,ans);
        //ans.setLength(ans.length() - 2);
        path(root.right,ans);
        ans.setLength(ans.length() - 2 - String.valueOf(root.val).length());
    }

//    ArrayList<String> list=new ArrayList<>();
//    public List<String> binaryTreePaths(TreeNode root) {
//        String ans="";
//        path(root,ans);
//        return list;
//    }
//    void path(TreeNode root, String ans) {
//        if(root==null) return;
    //这时候是新建了个String 地址 ， 把老String的东西+root.val 复制过来
//        ans=ans+root.val;
//        if(root.left==null && root.right==null){
//            list.add(ans);
//            return;
//        }
//        ans=ans+"->";
//        path(root.left,ans);
    //这个地方不用回溯， 因为是String 不可变性， 返回到这时还用的之前的老String
    //list的话 是一直在同一个地址修改 所以改完后要回溯， 而String不是
//        path(root.right,ans);
//    }
}
