import org.junit.Test;
//2639
public class FindtheWidthofColumnsofaGrid {
    @Test
    public void test(){
        int[][] grid={{1},{22},{333}};
        int[] res=findColumnWidth(grid);
        System.out.println(res);
    }

    public int[] findColumnWidth(int[][] grid) {
        int[] res=new int[grid[0].length];

        int l=0;
        for(int i=0;i<grid[0].length;i++){
            int max=Integer.MIN_VALUE;
            while(l<grid.length){

                String temp=grid[l++][i]+"";
                int len=temp.length();
                if(len>max){
                    max=len;
                    res[i]=max;
                }
            }
            l=0;
        }
        return res;
    }

}
