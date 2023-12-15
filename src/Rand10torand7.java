import org.junit.Test;

import java.util.Random;

public class Rand10torand7 {

    @Test
    public void test(){
//470
        int res=rand10();
        System.out.println(res);
    }

    public int rand7(){
        Random random = new Random();
        int rand = 0;
        while (true){
            rand = random.nextInt(8);
            if(rand !=0) break;
        }
        return rand;
    }
    public int rand10() {
            int temp=41;
            //拿到rand7 要先想怎么用 rand7 ，也就是用rand7怎么样无缝不间断的取到更多的数
        //必须要从0开始取数 这样才不间断 因为如果从1开始取 则生成 rand7 （1~7） rand7*7 （7,14,21,28,35,42,49） rand7*7+rand7()-1 的话 会生成不出来1,2,3,4,5,6
        //所以只能先想 (rand7()-1)*7+rand7()-1， 后想(rand7()-1)*7*7+(rand7()-1)*7+rand7()-1,在想(rand7()-1)*7*7*7+(rand7()-1)*7*7+(rand7()-1)*7+rand7()-1 以此类推
        //只有这样才能等概率无缝利用已知的rand7 获得更多rand数字
        //我可以获得很多rand数字 但是没必要 比如 我能等概率无缝生成0~42 那么就只需要 等概率无缝生成 0~39 再把这时候的值 % 10 就肯定是等概率无缝生成 0~9 再加1就是1~10  或者等概率无缝生成 0~29  再把这时候的值 % 10 就肯定也是等概率无缝生成 0~9 再加1就是1~10  %10 因为要求rand10
        //所以要求rand11 的话 就先等概率无缝生成 0~10 11个数 再+1 就是 1~11  或者 0~21 22个数 再%11 又变成  等概率无缝生成0~10（再+1 就是 1~11 ） 只要能等概率无缝生成 11的倍数的数就行
        //因为我必须从0 开始取 所以 能取到0~42  ，这个temp>=40(就是剔除40 和40以后的数 这样就是0到39 的数是等概率无缝取出的 （每个数被选中的概率必定一样）) 可以变成temp>=30（0到29）  temp>=20 temp>=10 只要是10倍数就行
        //一般会写成》=40  挑能取到的最大的整数倍取 因为这样可以少进循环几次 能快点
            while (temp>=40){
                //rand7()-1 0~6
                //rand7()-1)*7  0 7 14 21 28 35 42
                temp=(rand7()-1)*7+rand7()-1;
            }
            return (temp%10)+1;
    }


//    public int rand3(){
//        Random random = new Random();
//        int rand = 0;
//        while (true){
//            rand = random.nextInt(4);
//            if(rand !=0) break;
//        }
//        return rand;
//    }
//
//    public int rand11() {
//        int temp=41;
//        while (temp>=40){
//            //rand3()-1 0 1 2
//            //rand3()-1)*3 0 3 6
//            //rand3()-1)*3*3 0 9 18
//            temp=(rand3()-1)*3*3+(rand3()-1)*3+rand7()-1;
//        }
//        return (temp%10)+1;
//    }
}
