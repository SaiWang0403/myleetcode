import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    @Test
    public void test(){
        int n=3;
        int k=2;
        List<List<Integer>> res=combine(n,k);
        System.out.println(res);
    }


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        int u=1;
        dfs(res,new ArrayList<>(),n,k,u);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> list, int n, int k, int u){
        if(k==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=u;i<=n;i++){
            list.add(i);
            dfs(res,list,n,k-1,i+1);
            list.remove(list.size()-1);
        }
    }
}
