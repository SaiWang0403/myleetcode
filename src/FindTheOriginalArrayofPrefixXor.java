import org.junit.Test;
//2433
public class FindTheOriginalArrayofPrefixXor {
    @Test
    public void test(){
        int[] pref={5,2,0,3,1};
        int[] res=findArray(pref);
        for (int i:res){
            System.out.println(i);
        }
    }

    public int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        result[0] = pref[0];
        for(int i = 1; i < pref.length; i++) {
            result[i] = pref[i] ^ pref[i-1];
        }
        return result;
    }
}
