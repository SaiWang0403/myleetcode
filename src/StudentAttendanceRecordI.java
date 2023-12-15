import org.junit.Test;
//551
public class StudentAttendanceRecordI {

    @Test
    public void test(){
        String s="PPALLP";
        boolean res=checkRecord(s);
        System.out.println(res);
    }

    public boolean checkRecord(String s) {

        boolean absent = false;
        int lcount = 0;
        for (int i=0, n=s.length(); i<n; i++) {
            char curr = s.charAt(i);
            if (curr == 'L') {
                if (lcount == 2) return false;
                lcount++;
            } else {
                if (curr == 'A') {
                    if (absent==true) {
                        return false;
                    }
                    absent = true;
                }
                lcount = 0;
            }
        }

        return true;
    }
}
