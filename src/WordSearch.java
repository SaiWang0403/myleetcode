import org.junit.Test;

public class WordSearch {
    //79

    @Test
    public void test(){
//        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        char[][] board={{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        String word="AAB";
        boolean res=exist(board,word);
        System.out.println(res);
    }

    int[] d = {1, 0, -1, 0, 1};
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (dfs(i, j, 0, word, board)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int x, int y, int u, String s, char[][] board) {
        if (u == s.length() - 1) {
            return board[x][y] == s.charAt(s.length() - 1);
        }

        if (s.charAt(u) != board[x][y]) return false;
        board[x][y] = '$';
        for (int k = 0; k < 4; k++) {
            int nx = x + d[k], ny = y + d[k + 1];
            if (0 <= nx && nx < board.length && 0 <= ny && ny < board[0].length && board[nx][ny] != '$'){
                if (dfs(nx, ny, u + 1, s, board)) {
                    return true;
                }
            }
        }
        //如果要查的点查不到 那么把之前已经$的点位 给返回成原来的元素 再返回false 这样就会从上个标记$的点位 换个方向 接着找需要查的点
        //如果不这样 那么被标记的$的点 就永远退不回来了，这样不行，因为这个点可能还会被需要
        board[x][y] = s.charAt(u);
        return false;
    }
}
