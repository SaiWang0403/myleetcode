import org.junit.Test;
//1957
public class DeleteCharacterstoMakeFancyString {
    @Test
    public void test(){
        String s="leeetcode";
        String res=makeFancyString(s);
        System.out.println(res);
    }

    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        char prev=s.charAt(0);
        sb.append(prev);
        int freq=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==prev){
                freq++;
            }else{
                prev=s.charAt(i);
                freq=1;
            }
            if(freq<3){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
