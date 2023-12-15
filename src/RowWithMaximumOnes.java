import org.junit.Test;
//2643
public class RowWithMaximumOnes {
    @Test
    public void test(){
        int[][] mat={{0,1},{1,0}};
        int[] res=rowAndMaximumOnes(mat);
        for (int i:res){
            System.out.println(i);
        }
    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0;
        int[] res=new int[2];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                res[0]=i;
                res[1]=count;
            }
            max=Math.max(count,max);
        }
        return res;
    }
}
