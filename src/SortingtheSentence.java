import org.junit.Test;
//1859
public class SortingtheSentence {
    @Test
    public void test(){
        String s="is2 sentence4 This1 a3";
        String res=sortSentence(s);
        System.out.println(res);
    }
    public String sortSentence(String s) {
        String[] strarr=s.split(" ");
        String[] res=new String[strarr.length];
        for(int i=0;i<strarr.length;i++){
            int num=(int)(strarr[i].charAt(strarr[i].length()-1)-'0');
            res[num-1]=strarr[i].substring(0,strarr[i].length()-1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<res.length-1;i++){
            sb.append(res[i]);
            sb.append(" ");
        }
        sb.append(res[res.length-1]);
        return sb.toString();
    }
}
