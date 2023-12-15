import org.junit.Test;
//744
public class FindSmallestLetterGreaterThanTarget {
    @Test
    public void test(){
        char[] l={'c','f','j'};
        char t='a';
        char res=nextGreatestLetter(l,t);
        System.out.println(res);

    }

    public char nextGreatestLetter(char[] l, char t) {
        char ans=l[0];
        for(int i=0;i<l.length;i++)
        {
            if(l[i]>t)
            {
                ans=l[i];
                break;
            }
        }
        return ans;
    }
}
