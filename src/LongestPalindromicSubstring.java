import org.junit.Test;
//5
public class LongestPalindromicSubstring {

    @Test
    public void test(){
        String s="babad";
        String res=longestPalindrome(s);
        System.out.println(res);
    }

//关键方法 就是枚举找到中心点  从中间往两边扩散 判断回文情况 也可以叫中心扩散法
    public String longestPalindrome(String s) {
            String ans="";
            //枚举 最中间的数 然后向两边扩散
            for (int i=0; i<s.length();i++){
                //奇数回文 例如 cbabc
                int l=i-1;
                int r=i+1;
                //情况对的话 会往两边扩散 如果情况不对就不扩散 所以会比正常回文情况“bab” 多扩散一次
                while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                //如果之前的结果 小于 现在找到的回文长度  更新结果
                //0,2 扩散后成为 -1,3  而正常回文情况bab（应该是0,2） 是3个长度 所以r-l-1
                if(ans.length()<r-l-1){
                    //substring(0,3) 是取index 0,1,2 的这三个数
                    //因为之前多扩散一次 所以要l+1， 而且substring 是不会取最后一位index的  所以正好是r
                    ans=s.substring(l+1,r);
                }

                l=i;
                r=i+1;
    //这底下的条件都一样
                while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                if(ans.length()<r-l-1){
                    ans=s.substring(l+1,r);
                }
            }

            return ans;
    }


}
