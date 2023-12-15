import org.junit.Test;
//14
public class longestCommonPrefix {

    @Test
    public void test(){
        String[] ss={"flower","f","floor"};
        System.out.println(longestcommonprefix(ss));
    }

    public String longestcommonprefix(String[] strs){
        if(strs==null || strs.length ==0){
            return  "";
        }

        String[] strks= new String[strs[0].length()];
// f  fl  flo  flow  flowe  flower
        for (int i=0;i<strs[0].length();i++){
            strks[i] =strs[0].substring(0,i+1);
        }

        String res="";
        for (int i=0; i<strks.length;i++){
            String val1=strks[i];

            boolean isVal=true;
            for (int j=0;j<strs.length;j++){

                if(strs[j].length()<val1.length()){
                    isVal=false;
                    break;
                }
                String val2=strs[j].substring(0,val1.length());
                if(!val1.equals(val2)){
                    isVal=false;
                    break;
                }
            }
            if(!isVal){
                break;
            }else {
                res=val1;
            }
        }
        return  res;
    }
}
