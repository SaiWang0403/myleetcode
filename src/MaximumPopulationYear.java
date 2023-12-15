import org.junit.Test;
//1854
public class MaximumPopulationYear {
    @Test
    public void test(){
        int[][] logs={{1993,1999},{2000,2010}};
        int res=maximumPopulation(logs);
        System.out.println(res);
    }

    public int maximumPopulation(int[][] logs) {
        int pop[] = new int[2051], res = 0;
        for (var l : logs) {
            ++pop[l[0]];
            --pop[l[1]];
        }
        for (int i = 1950; i < 2051; ++i) {
            pop[i] += pop[i - 1];
            res = pop[i] > pop[res] ? i : res;
        }
        return res;
    }
}
