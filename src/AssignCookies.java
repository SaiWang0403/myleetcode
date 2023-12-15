import org.junit.Test;

import java.util.Arrays;
//455
public class AssignCookies {
    @Test
    public void test(){
        int[] g={1,2,3};
        int[] s={1,1};
        int res=findContentChildren(g,s);
        System.out.println(res);
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i =0;
        int j =0;
        int result=0;
        while(i<g.length&&j<s.length){
            if(g[i] <= s[j]){
                result++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return result;
    }
}
