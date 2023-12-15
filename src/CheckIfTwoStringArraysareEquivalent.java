import org.junit.Test;
//1662
public class CheckIfTwoStringArraysareEquivalent {
 @Test
    public void test(){
     String[] word1={"ab", "c"};
     String[] word2={"a", "bc"};
     boolean res=arrayStringsAreEqual(word1,word2);
     System.out.println(res);
 }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            sb1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            sb2.append(word2[i]);
        }
        return sb1.toString().equals(sb2.toString());
    }

}
