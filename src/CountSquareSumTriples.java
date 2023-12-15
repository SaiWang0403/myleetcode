import org.junit.Test;
//1925
public class CountSquareSumTriples {
    @Test
    public void test(){
        int n=12;
        int res=countTriples(n);
        System.out.println(res);
    }
    //需要r《=n
// 5 12 13
    public int countTriples(int n) {
        int c = 0;
        for(int i=1 ; i<=n ; i++){
            for(int j=i+1 ; j<=n ; j++){
                int sq = ( i * i) + ( j * j);
                int r = (int) Math.sqrt(sq);
                if( r*r == sq && r <= n )
                    c += 2;
            }
        }
        return c;
    }
}
