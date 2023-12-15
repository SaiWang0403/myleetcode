import org.junit.Test;
//344
public class ReverseStringCharArray {

    @Test
    public void test(){
        char[] s={'a','b','c'};
        reverseString(s);
        System.out.println(s);
    }


    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        reverse(s,start,end);
    }

    public char[] reverse(char[] s, int start, int end){
        while(start<end){
            swap(s,start,end);
            start++;
            end--;
        }
        return s;
    }

    public void swap(char[] s, int a, int b){
        char temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }
}
