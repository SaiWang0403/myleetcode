import org.junit.Test;
//888
import java.util.HashSet;

public class FairCandySwap {
    @Test
    public void test(){
        int[] a={2};
        int[] b={1,3};
        int[] res=fairCandySwap(a,b);
        for (int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0;
        int sumB = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int alice:aliceSizes){
            sumA+=alice;
            hs.add(alice);
        }
        for(int bob:bobSizes){
            sumB+=bob;
        }
        int diff = (sumA-sumB)/2;
        for(int i =0;i<bobSizes.length;i++){
            int target = diff+bobSizes[i];
            if(hs.contains(target)){
                return new int[]{target, bobSizes[i]};
            }
        }

        return null;
    }
}
