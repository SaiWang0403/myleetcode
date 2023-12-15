import org.junit.Test;
//2678
public class NumberofSeniorCitizens {
    @Test
    public void test(){
        String[] details={"7868190130M7522","5303914400F9211","9273338290F4010"};
        int res=countSeniors(details);
        System.out.println(res);
    }
    public int countSeniors(String[] details) {
        int res=0;
        for(int i=0;i<details.length;i++){
            int first=details[i].charAt(11)-48;
            int second=details[i].charAt(12)-48;
            int temp=first*10+second;
            if(temp>60){
                res++;
            }
        }
        return res;
    }

}
