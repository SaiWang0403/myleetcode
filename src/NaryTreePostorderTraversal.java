import org.junit.Test;
//590
import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    @Test
    public void test(){
        List<Node> list=new ArrayList<>();
        list.add(new Node(2));
        list.add(new Node(3));

        Node node=new Node(1,list);
        List<Integer> res =postorder(node);
        System.out.println(res);
    }

    public List<Integer> postorder(Node root) {

        List<Integer> res=new ArrayList<>();
        if (root == null) return res;
        process(root,res);
        res.add(root.val);
        return res;
    }
    public void process(Node root, List<Integer> res){
        if(root.children==null){
            return;
        }
        for(Node child :root.children){
            process(child,res);
            res.add(child.val);
        }
    }
}
