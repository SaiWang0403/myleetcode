import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvince {
    //547

    @Test
    public void test(){
        int[][] arr={{1,1,0},{1,1,0},{0,0,1}};
        int res=numberOfProvince(arr);
        System.out.println(res);
    }

    public int numberOfProvince(int[][] arr){

        //a，b，c城市分别所在0,1,2 位置
        //从 a城市出发找 标记a城 先找到了离他最近的b城 标记b城，就接着从b城找 看除了a城 谁和b城有关系，如果有c，标记c城 就再从c找，如果没了，返回上一层b 找除了c 之外还有哪些城，如果有继续，如果没有 再返回a 接着找看谁还和a有关系，这么做会走过所有和a直接或间接有关的城，并把这所有有关的城（a，b，c）的城标记，和这些城完全没关系的城市会是在别的省，所以会用递归，递归就是会一直顺着这条路往下探寻，当没路了会退回上一层的的循环并继续探寻上一层循环还有没有路
        //一路走 一路标记，从a走完后 provice+1，这时候所有和a有关的城市都被标记了，之后就换找没被标记的路接着走，没被标记的路必然和a和b和c 都一点关系没有
        // 就是先发现一条最近的路线 然后顺着这条路一路走到底，没路了就退回上一层 再找路线再走到底

        int citys=arr.length;
        // 把 {1,1,0} 看成a 城市 ， 把{1,1,0} 看成b城市，把{0,0,1}看成c城市  3个城市
        //把每个城市都打个标记  开始都是false  如果dfs的时候 发现a{1,1,0} 第二个1 时候就说明 那个位置的城市和a有关 然后寻找这个位置的城市（b） 都关联哪些城市
        boolean[] visited= new boolean[citys];
        int provinces=0;

        for (int i=0; i<citys;i++){
            if(!visited[i]){
                //dfs 方法就是把a-》b 标记起来 visited，然后province+1 就是把a，b 看成一个省了，以后看到b就不进dfs了，以后找没被标记的城市继续dfs
                dfs(i,citys,visited,arr);
                provinces++;
            }
        }
        return provinces;
    }

    //dfs 这个方法的作用就是看 当前位置 的城市 和哪些城市（b）有关（通过if(arr[i][j]==1 && !visited[j])）， 如果和另一个城市有关 就把另一个城市标记成已经visited =true  再接着看b这个城市和哪些城市有关 （如果有 c，d，e 没有f，就把abcde都标记城visited，看成一个省份，province+1，后会接着看城市f的情况）
    //第一次会是i=0 j=0，然后把j又传入了dfs里，这时候还在a城市，可以理解为mock 出来的a城（a城克隆体） 再用a城克隆体去找和a城相关的城

    public void dfs(int i,int citys,boolean[] visited,int[][] arr){
        for (int j=0;j<citys;j++){
            if(arr[i][j]==1 && !visited[j]) {
                visited[j]=true;
//深度优先 就是进入这个新的 有联系的城市b ，看还有什么城市和他有联系 比如顺着原先的第一个城市a 到这个城市的第一个有联系的城市b， 再通过b 到和b有关的城市c， 把这一条线经过的城市全标记成true， abc就是一个省份 以后看到true就不用遍历了
                //到这步就说明 这个城市b和a有关系  把j递归成i 就是看这个和a有联系的b ， 这个b 还和什么城市有关
                dfs(j,citys,visited,arr);
            }
        }
    }

    //第二种方法bfs
    //广度优先就是先找到所有与a直接相关的城市（比如 有b） 放在queue里，当这个queue不为空就 探寻b城和哪些城直接有关，一圈一圈的往外探索，当queue为空了就说明和a城所有直接间接有关的城市都探索完了，这些城市互相直接或间接有关，可以看成一个省，并都被出queue时标记过
    //再回到外面的for循环 找没有被标记的城市，再一圈一圈的探索
    public int bfs(int[][] arr){
        int citys=arr.length;
        boolean[] visited= new boolean[citys];
        int provinces=0;
        Queue<Integer> queue =new LinkedList<Integer>();
        for (int i=0;i<citys;i++){
            if(!visited[i]){
                queue.offer(i);
                while (!queue.isEmpty()){
                    int k=queue.poll();
                    visited[k]=true;
                    for (int j=0;j<citys;j++){
                        if(arr[i][j]==1 && !visited[j]){
                            queue.offer(j);
                        }
                    }
                }
                provinces++;
            }
        }
        return provinces;
    }
}
