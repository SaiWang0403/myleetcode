import org.junit.Test;
//589
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NaryTreePreorderTraversal {
    @Test
    public void test(){
        List<Node> list=new ArrayList<>();
        list.add(new Node(2));
        list.add(new Node(3));

        Node node=new Node(1,list);
        List<Integer> res =preorder(node);
        System.out.println(res);
    }

    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;
        res.add(root.val);
        process(root, res);
        return res;
    }

    public static void process(Node n, List<Integer> list) {
        if(n.children==null){
            return;
        }
        for (Node child : n.children) {
            list.add(child.val);
            process(child, list);
        }
    }
}
