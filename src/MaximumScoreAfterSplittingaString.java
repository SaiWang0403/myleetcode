import org.junit.Test;

public class MaximumScoreAfterSplittingaString {
    @Test
    public void test(){
        String s="011101";
        int res=maxScore(s);
        System.out.println(res);
    }
    public int maxScore(String s) {
        int max =0;
        for(int i =0; i<s.length()-1; i++)
//         把0做replace("1","")   因为replace（old，new）  0里面没有1 所以不变 ，0还在 ，所以length还是1
            //把0做replace("0","") 就是把0给replace成 “” 了 所以就没了，length就是0
            //所以s.substring(0,i+1).replace("1","").length() 干的是把左面的部分的1都给变成“” （变没）留下的就是0的长度，也就是有多少个0
            //右面部分就是把0都给变没 留下的就是剩下多少个1
            max = Math.max(max,s.substring(0,i+1).replace("1","").length()+s.substring(i+1).replace("0","").length());

        return max;
    }
}
