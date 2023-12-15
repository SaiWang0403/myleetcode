// A Dynamic Programming based solution for 0-1 Knapsack problem
class Knapsack {
    //动态规划 背包问题
//https://medium.com/javarevisited/learn-dynamic-programming-by-solving-knapsack-problem-in-java-e3bc20ed3f7b
    // A utility function that returns maximum of two integers
    static int max(int a, int b)
    { return (a > b) ? a : b; }

    // Returns the maximum value that can be put in a knapsack
    // of capacity W
    static void knapSack(int W, int wt[], int val[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        // i 0~4
        // w 0~8
        for (i = 0; i<= n; i++) {
            for (w = 0; w<= W; w++) {
                //第一行或第一列 都变成0，方便下一行 计算 （可以直接加0）
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                //当前物品重量《= 可承受重量时
                else if (wt[i - 1]<= w)
                    //当前物品的价值加上 剩余空间的价值（也就是可以承重的总数-当前物品的重量   这么多重量还能有多少价值）
                    //也就是 当前物品价值 加上 找到 上一行（k【i-1】） 的 可以承重的总数-当前物品的重量 的价值， 这个价值必然是那个重量的最大价值（因为上一行的值在之前计算过）
                    //那上面那个数 和上一行当前这个重量的数（也就是之前算过的这个重量能有的最大价值）比较 取大的那个值作为这个格子的新值
                    K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    //如果当前物品的重量 比可以承受的重量 要大 那就说明放不下当前物品，那就取之前的值（上一行该重量的价值）
                    K[i][w] = K[i - 1][w];
            }
        }
        System.out.println("max value is " + K[n][W]);

//        return K[n][W];


        while (n != 0) {
            //如果现在这个格子 和 上一行（w相同）的这个格子一样， 那就说明没有用到当前这一行的物品
            //如果现在这个格子 和 上一行（w相同）的这个格子不一样，那就说明用到当前这一行的物品
            //也就是当初比MAX 的时候 用了 val[i - 1] + K[i - 1][w - wt[i - 1]] （当前物品的价值加上 剩余空间的价值）
            //所以输出一下 说 用到当前这一行的物品
            //然后可承受总重量要减去当前这一行物品的 重量， 因为这一行物品必然用了，然后需要往前查 当时那个重量的价值的时候 用了什么物品才达到了当时的价值
            if (K[n][W] != K[n - 1][W]) {
                System.out.println("Pack " + n + " with weight = " + wt[n - 1] + " and value = " + val[n - 1]);
//wt[n - 1] 也就是这一行物品的重量
                // W =W - wt[n - 1] 也就是需要接着查的重量 变成了 可承受重量- 当前这一行物品的重量
                W = W - wt[n - 1];
            }
            n--;
        }
    }

    // Driver program to test above function
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
        knapSack(W, wt, val, n);
//        System.out.println(knapSack(W, wt, val, n));
    }
}