import org.junit.Test;
//2269
public class FindtheKBeautyofaNumber {
    @Test
    public void test(){
        int num=240;
        int k=2;
        int res=divisorSubstrings(num,k);
        System.out.println(res);
    }

//    public int divisorSubstrings(int num, int k) {
//        String str=String.valueOf(num); // to covert integer to String
//        int count=0;   // count of ans..
//        for(int i=0;i<str.length()-k+1;i++)  // deciding the starting index of window
//        {
//            String temp=str.substring(i,i+k);    // storing string till window length
//            int n1=Integer.valueOf(temp);       // converting string to integer
//            if(n1==0)     // to avoid division error
//            {
//                continue;
//            }
//            if(num%n1==0)      // if it is divisible then increase the count
//            {
//                count++;
//            }
//        }
//        return count;  // lastly return our coun
//    }
public int divisorSubstrings(int num, int k) {
    int i=0;
    String s=num+"";
    int res=0;
    while(i+k-1<s.length()){
        String sub=s.substring(i,i+k);
        int n=Integer.valueOf(sub);
        if(n==0){
            continue;
        }
        if(num%n==0){
            res++;
        }
        i++;
    }
    return res;
}
}
