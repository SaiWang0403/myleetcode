import org.junit.Test;
//2490
public class CircularSentence {
    @Test
    public void test(){
        String s="leetcode exercises sound delightful";
        boolean res=isCircularSentence(s);
        System.out.println(res);
    }

    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        if(arr.length==1){
            if(arr[0].charAt(0)==arr[0].charAt(arr[0].length()-1)){
                return true;
            }else{
                return false;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].charAt(arr[i].length()-1)==arr[i+1].charAt(0)){
                continue;
            }else{
                return false;
            }
        }
        if(arr[arr.length-1].charAt(arr[arr.length-1].length()-1)!=arr[0].charAt(0)){
            return false;
        }
        return true;
    }
}
