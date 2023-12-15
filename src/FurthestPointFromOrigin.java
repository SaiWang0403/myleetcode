import org.junit.Test;
//2833
public class FurthestPointFromOrigin {
    @Test
    public void test(){
        String moves="L_RL__R";
        int res=furthestDistanceFromOrigin(moves);
        System.out.println(res);
    }

    public int furthestDistanceFromOrigin(String moves) {
        int temp=0;
        int len=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                temp--;
                len++;
            }else if(moves.charAt(i)=='R'){
                temp++;
                len++;
            }
        }
        int e=moves.length()-len;
        if(temp>=0){
            return temp+e;
        }
        return Math.abs(temp-e);
    }
}
