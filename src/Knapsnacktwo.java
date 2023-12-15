public class Knapsnacktwo {

    public static void main(String args[])
    {
        //各个物品价值
        int val[] = new int[] { 2,6,4,3 };
        //各个物品重量
        int wt[] = new int[] { 3,4,5,6 };
        //我袋子可以承受的总重量
        int W = 8;
        //有几个物品
        int n = val.length;
        knapSack2(W, wt, val, n);
//        System.out.println(knapSack(W, wt, val, n));
    }

    public static void knapSack2(int W, int[] wt, int[] val, int n){

        int[][] k=new int[n+1][W+1];
        for (int i=0;i<=n;i++){
            for (int w=0;w<=W;w++){
                if(i==0 || w==0){
                    k[i][w]=0;
                }
                else if(wt[i-1]<=w){
                    k[i][w]=Math.max(val[i-1]+k[i-1][w-wt[i-1]],k[i-1][w]);
                }
                else {
                    k[i][w]=k[i-1][w];
                }
            }
        }
        System.out.println(k[n][W]);

        while (n!=0){
            if (k[n][W]!=k[n-1][W]){
                System.out.println("Pack " + n + " with weight = " + wt[n - 1] + " and value = " + val[n - 1]);

                W=W-wt[n-1];
            }
           n--;

        }
    }

}
