import org.junit.Test;
//1791
public class FindCenterofStarGraph {
    @Test
    public void test(){
        int[][] edges={{1,2},{2,3},{4,2}};
        int res=findCenter(edges);
        System.out.println(res);
    }

    public int findCenter(int[][] edges) {
        if(edges[0][0]==edges[1][0] || edges[0][0]==edges[1][1]){
            return edges[0][0];
        }else{
            return edges[0][1];
        }
    }
}
