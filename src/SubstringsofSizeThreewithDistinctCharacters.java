import org.junit.Test;
//1876
import java.util.HashMap;

public class SubstringsofSizeThreewithDistinctCharacters {
    @Test
    public void test(){
        String s="xyzzaz";
        int res=countGoodSubstrings(s);
        System.out.println(res);
    }
    //substring size很大时 用map

    public int countGoodSubstrings(String s) {
        int i=0;
        int j=0;
        int count=0;
        HashMap<Character,Integer> bi = new HashMap<>();
        while(j<s.length()){
            bi.put(s.charAt(j),bi.getOrDefault(s.charAt(j),0)+1);
            if((j-i+1)<3){
                j++;
            }
            else{
                if(bi.size()==3){
                    count++;
                }
                bi.put(s.charAt(i),bi.get(s.charAt(i))-1);
                if(bi.get(s.charAt(i))==0){
                    bi.remove(s.charAt(i));
                }
                i++;
                j++;
            }
        }

        return count;
    }

//    public int countGoodSubstrings(String s) {
//        int i=0;
//        int j=2;
//        int count=0;
//        while(j<s.length()){
//            if(s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2)
//                    && s.charAt(i+2) != s.charAt(i)){
//                count++;
//            }
//            i++;
//            j++;
//        }
//        return count;
//    }
}
