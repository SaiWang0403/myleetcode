import org.junit.Test;

public class DetectCapital {
    //520
    @Test
    public void test(){
        String word="FlaG";
        boolean res=detectCapitalUse(word);
        System.out.println(res);
    }


    public boolean detectCapitalUse(String word) {

        if(Character.isLowerCase(word.charAt(0))) return firstCharacterSmall(word);
        return firstCharacterCapital(word);
    }
    public boolean firstCharacterSmall(String word){
        return word.chars().allMatch(c->c>=97);
    }
    public boolean firstCharacterCapital(String word){
        return word.chars().allMatch(c->c<=90) || firstCharacterSmall(word.substring(1));
    }
}
