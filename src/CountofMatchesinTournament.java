import org.junit.Test;
//1688
public class CountofMatchesinTournament {
    @Test
    public void test(){
        int n=14;
        int res=numberOfMatches(n);
        System.out.println(res);
    }
    int res=0;
    public int numberOfMatches(int n) {

        check(n,0);
        return res;

    }

    public void check(int n,int count){
        if(n==1){
            res=count;
            return;
        }
        if(n%2==0){
            count+=n/2;
            n=n/2;
            check(n,count);
        }else if(n%2==1){
            count+=(n-1)/2;
            n=(n-1)/2+1;
            check(n,count);
        }

    }
}
