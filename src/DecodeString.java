import org.junit.Test;

import java.util.*;


//394
public class DecodeString {
//  3[abd2[c]]2[c] accaccacc
    //2[abc]3[cd]ef
    //2ab->aab

    public static void main(String[] args) {
        System.out.println(solve("2[abc]"));
        System.out.println(solve("2ab"));
        System.out.println(solve("3[abd2[c]]2[c]"));
    }

    static String solve(String s) {
        Deque<Integer> numStk = new ArrayDeque<>();
        Deque<StringBuilder> sStk = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int k = ch - '0';
                if (s.charAt(i + 1) != '[') {
                    sStk.push(new StringBuilder(String.valueOf(s.charAt(i + 1)).repeat(k)));
                    i++;
                } else {
                    numStk.push(k);
                }
            } else if (ch == '[') {
                i++;
                int j = i;
                while (j < s.length() && !Character.isDigit(s.charAt(j)) && s.charAt(j) != ']') {
                    j++;
                }

                sStk.push(new StringBuilder(s.substring(i, j)));
                i = j - 1;
            } else if (ch == ']') {
                StringBuilder sb = sStk.pop();
                int k = numStk.pop();
                StringBuilder ss = new StringBuilder(sb.toString().repeat(k));
                if (sStk.isEmpty()) {
                    sStk.push(ss);
                } else {
                    sStk.peek().append(ss);
                }
            }else {
                int j = i;
                while (j < s.length() && Character.isLetter(s.charAt(j))) {
                    j++;
                }

                sStk.push(new StringBuilder(s.substring(i, j)));
                i = j - 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!sStk.isEmpty()) {
            sb.append(sStk.pollLast());
        }

        return sb.toString();
    }

    @Test
    public void test(){
        String s="3ab";
        System.out.println(decodeString(s));
    }
    int ptr;
    public String decodeString(String s) {
        int num=0, i=0, len=s.length();
        StringBuilder res = new StringBuilder();
        Stack<Integer> stackNum = new Stack<>();
        Stack<StringBuilder> stackSb = new Stack<>();

        while(i<len){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                //num需要*10 因为要累加每一位的数 才是这个数 比如100【a】
                num  = num*10+ ch - '0';

                if (s.charAt(i + 1) != '[') {
//                    StringBuilder out = stackSb.size()==0 ? res : stackSb.peek();
//                    stackNum.push(num);
//                    stackSb.push(new StringBuilder());
//                  StringBuilder sb = stackSb.pop();
//                int n = stackNum.pop();
                StringBuilder out = stackSb.size()==0 ? res : stackSb.peek();
                for(int j=0;j<num;j++)
                    out.append(s.charAt(i+1));

                i++;
                num=0;
            }
            }

        else if(ch=='['){
                stackNum.push(num);
                stackSb.push(new StringBuilder());
                num=0;
            }else if(ch==']'){
                StringBuilder sb = stackSb.pop();
                int n = stackNum.pop();
                StringBuilder out = stackSb.size()==0 ? res : stackSb.peek();
                for(int j=0;j<n;j++)
                    out.append(sb);
            }else{ //a...z
                //如果只出现一个数 比如a 那么直接在res赋值
                StringBuilder out = stackSb.size()==0 ? res : stackSb.peek();
                out.append(ch);
            }
            i++;
        }
        return res.toString();
    }
}


