import org.junit.Test;
//415
public class AddStrings {

    @Test
    public void test(){
        String x="456";
        String y="77";
        String res=addStrings(x,y);
        System.out.println(res);
    }

    public String addStrings(String x,String y){
        StringBuilder sb= new StringBuilder();
        String s="";
        int carry=0;
        for (int i=x.length()-1, j=y.length()-1; i>=0 || j>=0 || carry==1 ; i--,j-- ){
                int a=i<0 ? 0 : x.charAt(i)-'0';
                int b=j<0 ? 0 : y.charAt(j) -'0';
                sb.append((a+b+carry)%10);
//            s=s+(a+b+carry)%10;
                carry=(a+b+carry)/10;

        }
        return sb.reverse().toString();


    }
    public String addStrings2(String x,String y){
        int a=Integer.parseInt(x);
        int b=Integer.parseInt(y);
        int c=a+b;
        String d =Integer.toString(c);
        return d;
    }

}
