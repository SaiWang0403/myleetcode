import org.junit.Test;
//1773
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingaRule {
    @Test
    public void test(){
        List<List<String>> items=new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));
        String ruleKey="color";
        String ruleValue="silver";
        int res=countMatches(items,ruleKey,ruleValue);
        System.out.println(res);
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index=0;
        if(ruleKey.equals("color")){
            index=1;
        }
        else if(ruleKey.equals("name")){
            index=2;
        }
        int count=0;
        for(List<String> item:items){
            if(item.get(index).equals(ruleValue)){
                count+=1;
            }
        }
        return count;
    }
}
