import org.junit.Test;
//799
public class ChampagneTower {

    @Test
    public void test(){
        //倒5杯酒
        int pourined=5;
        //从 0开始算 所以2是第三行
        int query_row=2;
        //从0开始算 所以1是第二个
        int query_glass=1;
        double res=champagneTower(pourined,query_row,query_glass);
        System.out.println(res);
    }

    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] ca= new double[101][101];
        ca[0][0]=poured;
        //r就是第几排 也就是query_row
        for (int r=0;r<=query_row;r++){
            //l就是当前排的第几个杯子 也就是 query_glass
            for (int l=0;l<=r;l++){
                //d就是 往下一排左面或者右面溢出的酒量， 如果d》0 就说明溢出了酒
                double d=(ca[r][l]-1.0)/2;
                if(d>0){
                    //左下方的杯子得到的溢出的酒 左下方的l 肯定和当前的l一样
                    ca[r+1][l]+=d;
                    //右下方杯子得到的溢出的酒 右下方的l 肯定是当前l+1
                    ca[r+1][l+1]+=d;
                }
            }
        }
        return Math.min(1,ca[query_row][query_glass]);
    }
}
