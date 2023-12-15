import org.junit.Test;
//1071
public class GreatestCommonDivisorofStrings {
    @Test
    public void test(){
        String s1="ababab";
        String s2="abab";
        String res=gcdOfStrings(s1,s2);
        System.out.println(res);
    }

    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenated strings are equal or not, if not return ""
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        // If strings are equal than return the substring from 0 to gcd of size(str1), size(str2)
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    public int gcd(int a,int b){
        return b==0 ? a :gcd(b,a%b);
    }

}
