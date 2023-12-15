import org.junit.Test;
//2089
import java.util.*;

public class DestinationCity {
    @Test
    public void test(){
        List<List<String>> paths= new ArrayList<>();
        paths.add(Arrays.asList("B","C"));
        paths.add(Arrays.asList("D","B"));
        paths.add(Arrays.asList("C","A"));
        String res=destCity(paths);
        System.out.println(res);


    }

    public String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();
        for (List<String> path : paths) {
            cities.add(path.get(0));
        }

        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!cities.contains(dest)) {
                return dest;
            }
        }
        return "";
    }
}
