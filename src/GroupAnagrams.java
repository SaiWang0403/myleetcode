import org.junit.Test;

import java.util.*;

public class GroupAnagrams {
    //49
    @Test
    public void test(){
        String[] arr= {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res=groupAnagrams(arr);
        System.out.println(res);
    }



    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map= new HashMap<>();
        for (int i=0; i<strs.length;i++){
            char[] arr =strs[i].toCharArray();
            Arrays.sort(arr);
            String pattern= String.valueOf(arr);
            if(!map.containsKey(pattern)){
                map.put(pattern,new ArrayList<>());
            }
            map.get(pattern).add(strs[i]);
        }

        List<List<String>> res= new ArrayList<>();
        for (Map.Entry<String,List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
