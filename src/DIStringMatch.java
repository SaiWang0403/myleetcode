import org.junit.Test;
//942
public class DIStringMatch {
    @Test
    public void test(){
        String s="IDID";
        int[] res=diStringMatch(s);
        for (int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int end = result.length - 1, start = 0;
        int index = 0;
        while(index < s.length()){
            if(s.charAt(index) == 'I'){
                result[index] = start;
                start++;
            }else{
                result[index] = end;
                end--;
            }
            index++;
        }
        result[result.length - 1] = start;
        return result;
    }
}
