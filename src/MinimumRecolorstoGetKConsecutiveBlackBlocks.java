import org.junit.Test;
//2379
public class MinimumRecolorstoGetKConsecutiveBlackBlocks {
    @Test
    public void test(){
        String s="WBWBBBW";
        int k=2;
        int res=minimumRecolors(s,k);
        System.out.println(res);
    }


    public int minimumRecolors(String s, int k) {
        int counter = 0;
       for(int i=0;i<k;i++){
            if(s.charAt(i)=='W'){
                counter++;
            }
       }

        int min=counter;
        int start=0;
        int end=k-1;
        while(end<s.length()-1){
          if(s.charAt(start)=='W'){
              counter--;
          }
            start++;
            end++;
            if(s.charAt(end)=='W'){
                counter++;
            }
            min = Math.min(counter, min);
        }
        return min;
    }
}
