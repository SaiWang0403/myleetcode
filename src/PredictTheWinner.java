import org.junit.Test;

public class PredictTheWinner {
    //486
//如果两个人取到的值一样 那么算player1 赢
    @Test
    public void test(){
        int[] arr={3,5,7};
        int sum=0;
        for (int i :arr){
            sum+=i;

        }
        int p1=maxScore(arr,0,arr.length-1);
        System.out.println(p1>=sum-p1);
    }
//player1 能取到的最大值
    public int maxScore(int[] arr, int l,int r){
        if(l==r){
            return arr[l];
        }
        //如果player1 这轮选左面能取到的最大值
        int sleft=0;
        //如果player1 选右面能取到的最大值
        int rright=0;
        if(r-l==1){
            sleft=arr[l];
            rright=arr[r];
        }
        if(r-l>1){
            sleft=arr[l]+Math.min(maxScore(arr,l+2,r),maxScore(arr,l+1,r-1));
            rright=arr[r]+Math.min(maxScore(arr,l+1,r-1),maxScore(arr,l,r-2));
        }

        return Math.max(sleft,rright);
    }
}
