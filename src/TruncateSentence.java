import org.junit.Test;
//1816
public class TruncateSentence {
    @Test
    public void test(){
        String s="Hello how are you Contestant";
        int k=4;
        String res=truncateSentence(s,k);
        System.out.println(res);
    }

    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k-1;i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append(arr[k-1]);
        return sb.toString();
    }
}
