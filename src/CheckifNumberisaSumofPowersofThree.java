import org.junit.Test;
//1780
public class CheckifNumberisaSumofPowersofThree {

    @Test
    public void test(){
        int n=21;
        boolean res=checkPowersOfThree(n);
        System.out.println(res);
    }


    public boolean checkPowersOfThree(int n) {
        int cur = 1;
        while(cur<n){
            cur*=3;
        }
        if(cur==n) return true;
        int remaining = n-cur/3;
//        if(remaining >= cur/3) return false;
        return checkPowersOfThree(remaining);
    }
  //  因为要sum of distinct powers of three， 所以不能有 3+9+9=21 这种情况， 所以要保证第一次遍历后的cur/3 是最大的3的几次方， 之后剩的数必须比cur/3小，如果大于等于那就意味着后面又得用到cur/3 （3的这么多次方），那就不是distinct了

}
