import org.junit.Test;

import java.util.HashMap;
//12
public class IntegerToRoman {

    @Test
    public void test(){
        int num=6;
        String res=intToRoman(num);
        System.out.println(res);

    }

    public String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");

        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String result = "";
        while(num > 0){
            int i;
            for(i=0;i<arr.length;i++){
                if(arr[i] > num){
                    continue;
                }
                else{
                    break;
                }
            }
            result += map.get(arr[i]);
            num = num - arr[i];
        }
        return result;
    }
}
