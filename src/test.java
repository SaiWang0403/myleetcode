import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

public class test {

    @Test
    public void test() {

//        List<Integer> inputList = Arrays.asList(1,2,3);
//
//        Stream<Integer> inputStream =inputList.stream().map(i->i+5);
//
//
//
//        System.out.println("Stream with each element incremented by 5:");
//
//        inputStream.forEach(num -> System.out.print(num+","));





//        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 2, 3));
//        list.remove(2);
//        System.out.println(list);



//        String a="0";
//        int s=a.charAt(0);
//        System.out.println(s);

//        String input = "Geeks for Geeks";
//
//        StringBuilder input1 = new StringBuilder();
//
//        // append a string into StringBuilder input1
//        input1.append(input);
//
//        // reverse StringBuilder input1
//        input1.reverse();
//        // print reversed String
//        System.out.println(input1);

      //  'A'=65
//        int a ='B'-'A';
//        System.out.println(a);
//        char b=(char)('A'+1);
//        System.out.println(b);

//        StringBuilder s=new StringBuilder("");
//       s.append(1+"");
//        s.toString();
//        System.out.println(s);

//        String[] geeks = {"Rahul", "Utkarsh",
//                "Shubham", "Neelam"};
//
//        List<String> al =
//                new ArrayList<String>(Arrays.asList(geeks));
//        System.out.println(al);
//
//        // Adding some more values to the List.
//        al.add("Shashank");
//        al.add("Nishant");
//
//        System.out.println("\nArrayList After adding two" +
//                " more Geeks: ");
//        System.out.println(al);
//
//
//        int[] arr={1,2,3};
//        List<Integer> list=new ArrayList<Integer>(Arrays.asList(arr));

//        String s="as";
//        char[] schar=s.toCharArray();
//
//        System.out.println(schar[1]);

//        List<Integer> list =new ArrayList<>();
//        list.add(1);
//        System.out.println(list);

//        char 'a' 是97

//        String a="abc";
//        String[] arr=a.split("");
//        String b=arr.toString();
//        System.out.println(b);

        // A 65 Z 90
        // a 97 z122
        // 0 48
//        char c='0';
//        int a=c-0;
//        System.out.println(a);
//        String s="a";
//        char b='b';
//        char c='c';
//        String res=s+b+c;
//        System.out.println(res);
//        char c='a';
//        int num=c-97;
//        System.out.println(num);
//        int a=1;
//        int b=2;
//        boolean res= a!=b;
//        System.out.println(res);

//        ArrayList<Integer> arr=new ArrayList<>();
//        arr.add(12);
//        arr.add(2);
//
//        Collections.sort(arr);
//        System.out.println(arr);
//        char[] chars={'1','2'};
//        String s=new String(chars);
//        System.out.println(s);

//        Stack st = new Stack();
//
//        // populating stack
//        st.push("Java");
//        st.push("Source");
//        st.push("code");
//
//        // checking the top object
//        System.out.println("Top object is: "+st.peek());
//        System.out.println("Top object is: "+st);
//
//        ArrayList<Integer> arr=new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        System.out.println(arr.remove(1));
//        System.out.println(arr);

//        String s="";
//        s+="a";
//        s+="b";
//        StringBuilder sb=new StringBuilder();
//        sb.reverse();
//        System.out.println(s);
//        ArrayList a=new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        System.out.println(a);

//        StringBuilder sb=new StringBuilder();
//        sb.append(1);
//        System.out.println(sb);
//        char[] a={'1','2'};
//        System.out.println(new String(a));
//        int a ='a'-'b';
//        System.out.println(a);
//        String s="011101";
//        System.out.println(s.substring(0,1).replace("0","").length());
//        HashMap<Integer,Integer> map=new HashMap<>();
//        map.put(1,2);
//        System.out.println(map.containsValue(2));

//        String a="abc";
//        String b="cba";
//        System.out.println(a.equals(b));

//        int c='a'+1;
//        char c1='a'+1;
//        char c2=(char)c;
//        System.out.println(c);
//        System.out.println(c1);
//        System.out.println(c2);
//
//
//        int a=1;
//        int res=(a+'0');
//        System.out.println(res);

//        char a='1';
//        int res=a;
//        System.out.println(res);
//
//        String s="hello world";
//        String[] sr=s.split(" ");
//        for (int i=0;i< sr.length;i++){
//            System.out.println(sr[i]);
//        }
//        String s="Ab";
//        System.out.println(s.contains("A"));
//        HashMap<Integer,Integer> map=new HashMap<>();
//        map.put(9,10);
//        System.out.println(map.get(9));

//        System.out.println('7'-'0');
//        int[] arr={1,2,3};
//        System.out.println(Arrays.asList(arr).contains(1));
//        String s="egcfe";
//        String ss=s.replace('g','f');
//        System.out.println(ss);
//        char c='c';
//
//        System.out.println(c>97);
//           Character.isDigit('')
//        int[] arr={1,2};
//        String s="a";
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        Collections.reverse(list);
//        System.out.println(list);
//        StringBuilder sb=new StringBuilder("ab");
//        sb.reverse();
//
//        System.out.println(sb);
//        int a=1;
//        System.out.println(a+'1');
//        String str = "word1, word2 word3@word4?word5.word6";
//        //最后的+ 确保没有empty string
//        String[] arrOfStr = str.split("["+'.'+'?'+'@'+','+' '+"]+");
//
//        for (String a : arrOfStr)
//            System.out.println(a);
//        String s="1800";
//        StringBuilder sb=new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb);
//        String s="a:c";
//        String[] sr=s.split(":");
//        System.out.println(Arrays.asList(sr));
//        int t=2-'0';
//        System.out.println(t);
//        String s="+";
//        Character.valueOf(s);
//        int res=Integer.valueOf(s);
//        System.out.println(res);
//        StringBuilder sb=new StringBuilder(s);
//        sb.append("abcdef");
//        sb.delete(1,3);
//
//        System.out.println(sb);
//
//        int[] arr={1,2};
//        String res=new String(String.valueOf(arr));
//        System.out.println(res);
//        char[] arr={'0'};
//        System.out.println(arr[0]);
//        int c='4'-'0';
//        System.out.println(c);
        System.out.println(5 ^ 2 ^ 0);
//rest

    }
}








