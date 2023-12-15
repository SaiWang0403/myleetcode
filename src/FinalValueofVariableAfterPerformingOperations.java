import org.junit.Test;
//2011
public class FinalValueofVariableAfterPerformingOperations {
    @Test
    public void test(){
        String[] o={"--X","X++","X++"};
        int res=finalValueAfterOperations(o);
        System.out.println(res);
    }
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        for(int i=0;i<operations.length;i++){
            char c=operations[i].charAt(1);
            if(c=='+'){
                res++;
            }else{
                res--;
            }
        }
        return res;
    }
}
