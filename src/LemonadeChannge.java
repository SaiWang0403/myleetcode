import org.junit.Test;

public class LemonadeChannge {
    //860
    @Test
    public void test(){
        int arr[]={5,5,5,10,20};
        boolean res=lemonadeChannge(arr);
        System.out.println(res);
    }

    public boolean lemonadeChannge(int[] arr){
        int five=0;
        int ten=0;
        for (int bill :arr){
            if(bill==5){
                five++;
            }
            else if(bill==10){
                if(five==0){
                    return false;
                }
                five--;
                ten++;
            }
            else {
                //这里是贪心算法
                //就是要求出 局部最优
                //因为 20块钱 你可以用一个10 和一个 5 找零 或3个5 找零  必须先尝试用一个10 和一个5找零（这就是贪心） 在尝试用三个5
                //因为10块钱找零时 也需要5块， 所以5更重要 所以手上的钱要尽量先用10 块钱 再用5块钱
                // 手上有2个5块钱 肯定比留一个10块钱好
                if(five >0 && ten>0){
                    five--;
                    ten--;
                }else if(five>=3){
                    five-=3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

}
