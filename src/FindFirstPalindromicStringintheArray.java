import org.junit.Test;
//2108
public class FindFirstPalindromicStringintheArray {
    @Test
    public void test(){
        String[] arr={"abc","car","ada","racecar","cool"};
        String res=firstPalindrome(arr);
        System.out.println(res);
    }

    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            for(int x=0,y=words[i].length()-1;x<=y;x++,y--){
                if(words[i].charAt(x)!=words[i].charAt(y)){
                    break;
                }
                if(x+1>=y-1){

                    return words[i];
                }
            }
        }
        return "";
    }
}
