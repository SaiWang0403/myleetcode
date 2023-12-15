import org.junit.Test;
//2037
import java.util.Arrays;

public class MinimumNumberofMovestoSeatEveryone {
    @Test
    public void test(){
        int[] seats={3,1,5};
        int[] students={2,7,4};
        int res=minMovesToSeat(seats,students);
        System.out.println(res);
    }

    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int moves = 0;

        for(int i=0; i<seats.length; i++){
            moves += Math.abs(seats[i] - students[i]);
        }

        return moves;
    }
}
