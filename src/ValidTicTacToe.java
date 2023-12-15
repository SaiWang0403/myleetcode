import org.junit.Test;

public class ValidTicTacToe {
//794
    @Test
    public void test(){
        String[] arr={"XXX","OXO","O O"};
        boolean res=validTicTacToe(arr);
        System.out.println(res);
    }

    public boolean validTicTacToe(String[] board) {
        //X 先下棋

        //只有三种情况
        //1，X 赢    如果X赢 那么X的棋子数 必定比O 的棋子数多一个
        //2  O 赢   如果O赢 那么X的棋子数必定和 O 的棋子数 一样
        //3  谁都没赢  如果未分胜负， 那么有可能X比O 多一个 也有可能X和O 数量相等

        //所以只有两种情况
        //一种是X的棋子数比O 的棋子数 多一个
        //另一种数 X的棋子数 和O的棋子数相同

        int xCount=0;
        int oCount=0;
        for (String row :board){
            for (char c :row.toCharArray()){
                if(c =='X'){
                    xCount++;
                }
                if(c=='O'){
                    oCount++;
                }
            }
        }
        //要么X的棋子数比O 的棋子数 多一个  要么 X的棋子数 和O的棋子数相同  如果是这两种情况外那么直接false
        if(xCount != oCount && xCount - oCount !=1){
            return false;
        }
        //经过上面的判断后 留下的情况是 要么 X和O 棋子数相等 要么 X比O 多一个

        //有种情况是 有3个X 也有3个O（8个O 100个O 都不行 必须3个X 两个O 才算真的赢）  这种情况 经过win方法后算X赢 ，可是这种情况不应算X赢 因为这种情况不存在 （当第三个X落下的时候比赛就结束了）
        //所以必须win(board,"XXX") 和  xCount-oCount=1 两个条件都成立 才算x赢
        if(win(board,"XXX") && xCount-oCount!=1){
            return false;
        }
        //有种情况是 2个X 3个0 或者 8个X 3个0  都不行
        if(win(board,"OOO") && xCount-oCount !=0){
            return false;
        }
        //排除掉上面的条件 还剩下 要么X真的赢了（第一个条件win(board,"XXX") 是true 第二个条件 xCount-oCount!=1 false） 要么0真的赢了， 要么没人赢（棋子数差1 或相等， 但是win方法经过后是false） （win(board,"XXX") 是false）
        return true;

    }

    //判断这个棋盘上是不是出现了 X赢 或者出现了O赢  但是没考虑X的棋子数是不是比O多一个 或 X的棋子数是不是和O的棋子数相同
    public  boolean win(String[] board, String flag){
        for (int i=0; i<3;i++){
            //纵向三连
            if(flag.equals(""+board[0].charAt(i)+board[1].charAt(i)+board[2].charAt(i))){
                return true;
            }
            //横向三连
            if(flag.equals(board[i])){
                return true;
            }
        }
        // \向 三连
        if(flag.equals(""+board[0].charAt(0)+board[1].charAt(1)+board[2].charAt(2))){
            return true;
        }
        // /向 三连
        if(flag.equals(""+board[0].charAt(2)+board[1].charAt(1)+board[2].charAt(0))){
            return true;
        }
        //如果都不是 那就说明没人赢
        return false;
    }
}
