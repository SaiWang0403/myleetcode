import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    @Test
    public void test(){
        String pattern="abba";
        String s="dog cat cat dog";
        boolean res=wordPattern(pattern,s);
        System.out.println(res);
    }

    @Test
    public void test2() {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        s2 = new String("abc");
        System.out.println( s1 == s2);
    }


    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!charToWord.containsKey(c)) {
                charToWord.put(c, word);
            }

            if (!wordToChar.containsKey(word)) {
                wordToChar.put(word, c);
            }

            if(!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)){
                return false;
            }
        }

        return true;
    }
}
