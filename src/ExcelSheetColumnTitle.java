import org.junit.Test;

public class ExcelSheetColumnTitle {
    //168

    @Test
    public void test(){
        int columnNumber=28;
        String res=convertToTitle(columnNumber);
        System.out.println(res);

    }


    public String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber>0){
            columnNumber--;
            ans = (char) ('A'+ (columnNumber%26)) + ans;
            columnNumber = columnNumber/26;
        }
        return ans;
    }
}
