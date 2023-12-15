import org.junit.Test;
//1491
import java.util.Arrays;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    @Test
    public void test(){
        int[] salary={4000,3000,1000,2000};
        double res=average(salary);
        System.out.println(res);
    }

    public double average(int[] salary) {
        int num=salary.length-2;
        double sum=0;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++){
            sum+=salary[i];
        }
        return (double)sum/num;
    }
}
