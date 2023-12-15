import org.junit.Test;

import java.util.Arrays;

public class test3 {

    static void f(int a) {
        a=10;
    }

    public static void main(String[] args) {
        int a = 1;
        f(a);
        System.out.println(a);

    }




    static void f2(int[] a,int[] b) {
        int[] temp=a;
        a=b;
        b=temp;

    }

    @Test
    public  void test2() {
        int[] a ={1},  b = {2};
        f2(a, b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }


    static void f(int[] a,int[] b) {
        int temp=a[0];
        a[0]=b[0];
        b[0]=temp;
    }

    @Test
    public  void test1() {
        int[] a ={1},  b = {2};
        f(a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
