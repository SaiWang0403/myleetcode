import org.junit.Test;
//492
public class ConstructtheRectangle {

    @Test
    public void test(){
        int area=9;
        int[] res=constructRectangle(area);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }


    public int[] constructRectangle(int area) {
        int i = 0, j = area;
        int[] result = new int[2];
        while (i <= j){
            long product = i*j;
            if (product == area){
                result[0] = j--;
                result[1] = i++;
            } else if (product > area){
                j--;
            } else {
                i++;
            }
        }
        return result;
    }
}
