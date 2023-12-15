import org.junit.Test;

public class FloodFill {
    //733
    @Test
    public void test(){
        int[][] image={{1,1,1},{1,1,0},{1,0,1}};
        int[][] res=floodFill(image,1,1,2);
        for(int i=0;i<image.length;i++){
            for (int j=0;j<image[0].length;j++){
                System.out.println(res[i][j]);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // O(n) time | O(n) space
        int color = image[sr][sc];

        if(color != newColor)   DFS(image, sr, sc, color, newColor);

        return image;
    }

    public void DFS(int[][] image, int x, int y, int color, int newColor)
    {
        if(image[x][y] == color)
        {
            image[x][y] = newColor;

            if(x >= 1)  DFS(image, x-1, y, color, newColor);
            if(y >= 1)  DFS(image, x, y-1, color, newColor);
            if(x+1 < image.length)  DFS(image, x+1, y, color, newColor);
            if(y+1 < image[0].length)   DFS(image, x, y+1, color, newColor);
        }
    }
}
