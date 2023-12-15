import org.junit.Test;
//258
public class AddDigits {

    @Test
    public void test(){
        int num=38;
        int res=addDigits(num);
        System.out.println(res);

    }


    public int addDigits(int num) {
        String n = Integer.toString(num);
        if(n.length() == 1) return Integer.parseInt(n);

        int sum = 0;
        for(char c : n.toCharArray()){
            sum += Character.getNumericValue(c);
        }

        // for(int i=0;i<n.length();i++){
        //     char c= n.charAt(i);
        //     sum+=Character.getNumericValue(c);
        // }
        return addDigits(sum);
    }
}
