import org.junit.Test;
//657
public class RobotReturntoOrigin {
    @Test
    public void test(){
        String moves="UD";
        boolean res=judgeCircle(moves);
        System.out.println(res);
    }

    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == 'U') y--;
            else if (move == 'D') y++;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}
