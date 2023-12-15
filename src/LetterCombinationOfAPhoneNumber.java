import org.junit.Test;

import java.util.*;

public class LetterCombinationOfAPhoneNumber {
    @Test
    public void test(){
        String digits="23";
        List<String> res=letterCombinations(digits);
        System.out.println(res);
    }


    List<String> res= new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0){
            return Collections.emptyList();
        }
        Map<String,String> map= new HashMap<String,String>(){
            {
                put("2","abc");
                put("3","def");
                put("4","ghi");
                put("5","jkl");
                put("6","mno");
                put("7","pqrs");
                put("8","tuv");
                put("9","wxyz");
            }
        };
        backtrack(digits,map,0,new StringBuilder());
        return res;
    }

    public void backtrack(String digits,Map<String,String> map, int index,StringBuilder sb){
        //index 是用来记录 现在取到哪个数  开始是0 就是取“2,3” 中的2
        //当没得取了 就把当时的sb存入结果
        if(index == digits.length()){
            res.add(new  StringBuilder(sb).toString());
            return ;
        }
        //cur 是“2”
        String cur= digits.substring(index,index+1);
        //abc 所以length是3 要循环3遍
        for (int i=0; i<map.get(cur).length();i++){
            //先存入a
            sb.append(map.get(cur).charAt(i));
            //存入a后 要递归的找下一个要存的数 就把index+1 就把3 传进来
            backtrack(digits,map,index+1,sb);
            //存完 ad 后 要返回到a  这样以后才能把a 变成 ae 这步就是回溯
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
