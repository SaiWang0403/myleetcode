import org.junit.Test;
//2578
import java.util.Arrays;

public class SplitWithMinimumSum {
    @Test
    public void test(){
        int num=4325;
        int res=splitNum(num);
        System.out.println(res);
    }

    public int splitNum(int num) {
        int []ans=new int[10];
        while(num>0){
            ans[num%10]++;
            num/=10;
        }

        int num1=0;
        int num2=0;

        for(int i=0;i<10;i++){
            for(int j=0;j<ans[i];j++){
                if(num1<=num2){
                    num1=num1*10+i;
                }
                else{
                    num2=num2*10+i;
                }
            }
        }
        return num1+num2;
    }
}
