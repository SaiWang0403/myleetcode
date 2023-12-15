import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ValidSodoku {
    @Test
    public void test(){
        char[][] board={{'5','3','.','.','7','.','.','.','.'}
,{'6','.','.','1','9','5','.','.','.'}
,{'.','9','8','.','.','.','.','6','.'}
,{'8','.','.','.','6','.','.','.','3'}
,{'4','.','.','8','.','3','.','.','1'}
,{'7','.','.','.','2','.','.','.','6'}
,{'.','6','.','.','.','.','2','8','.'}
,{'.','.','.','4','1','9','.','.','5'}
,{'.','.','.','.','8','.','.','7','9'}};
        boolean res=isValidSudoku(board);
        System.out.println(res);


    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            List<Character> list = new ArrayList<>();
            for (int j = 0; j < 9; j++)
                list.add(board[i][j]);
            if (!checkValid(list)) return false;
        }

        for (int j = 0; j < 9; j++) {
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < 9; i++)
                list.add(board[i][j]);
            if (!checkValid(list)) return false;
        }

        // 0  1  2
        // 3  4  5
        //
        for (int i = 0; i < 9; i += 3)
            for (int j = 0; j < 9; j += 3) {
                List<Character> list = new ArrayList<>();
                for (int k = 0; k < 9; k++) {
                    int x = i + k / 3, y = j + k % 3;
                    list.add(board[x][y]);
                }
                if (!checkValid(list)) return false;
            }

        return true;
    }

    boolean checkValid(List<Character> list) {
        boolean[] exists = new boolean[10];
        for (char ch : list) {
            if (ch == '.') continue;
            if (exists[ch - '0']) return false;
            exists[ch - '0'] = true;
        }

        return true;
    }
}
