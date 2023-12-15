import org.junit.Test;

import java.util.Arrays;
//383
public class RansomNote {

    @Test
    public void test(){
        String a="ab";
        String b="aab";
        boolean res=canConstruct(a,b);
        System.out.println(res);
    }


    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() == 0){
            return true;
        }

        String[] note = ransomNote.split("");
        String[] mag = magazine.split("");
        Arrays.sort(note);
        Arrays.sort(mag);

        int magCounter = 0;
        for (String s : note) {
            //"abc" "ab" note里比mag多了 mag全找完了 note里还有东西没找
            if (magCounter == mag.length){
                return false;
            }
            while (!mag[magCounter].equals(s)) {
                //"a"   "b" 总不equal  mag都找到最后一个了 还不是note想要的 就说明mag里没这个note里的东西
                if (magCounter == mag.length - 1) {
                    return false;
                }

                    magCounter++;

            }
            magCounter ++;
        }
        return true;
    }
}
