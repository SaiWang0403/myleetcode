import org.junit.Test;
//1678
public class GoalParserInterpretation {
    @Test
    public void test(){
        String s="G()(al)";
        String res=interpret(s);
        System.out.println(res);
    }

    public String interpret(String command) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sb.append("G");
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append("o");
                i+=1;
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                sb.append("al");
                i+=3;
            }
        }

        return sb.toString();
    }
}
