import org.junit.Test;
//2496
public class MaximumValueofaStringinanArray {
    @Test
    public void test(){
        String[] strs={"alic3","bob","3","4","00000"};
        int res=maximumValue(strs);
        System.out.println(res);
    }

    public int maximumValue(String[] strs) {
        int res=0;
        for(int i=0;i<strs.length;i++){
            boolean flag=true;
            for(int j=0;j<strs[i].length();j++){
                if((strs[i].charAt(j)>=65 &&strs[i].charAt(j)<=90 )|| strs[i].charAt(j)>=97 &&strs[i].charAt(j)<=122){
                    flag=false;
                    break;
                }
            }
            if(flag==false){
                res=Math.max(res,strs[i].length());
            }else{
                res=Math.max(res,Integer.parseInt(strs[i]));
            }
        }
        return res;
    }
}
