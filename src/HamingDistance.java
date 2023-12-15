import org.junit.Test;
//461
public class HamingDistance {
    @Test
    public void test(){
        int x=21;
        int y=2;
        int res=hamingDistance(x,y);
//        int res=countOneInNumber(x);
        System.out.println(res);
    }

    public int hamingDistance(int x, int y){
        int distance=0;
        for (int xor=x^y; xor!=0; xor&=(xor-1)){
            distance++;
        }
        return distance;
    }

    public int countOneInNumber(int x){
        int count=0;
        while (x!=0){
            x&=(x-1);
            count++;
        }
        return count;
    }
}
