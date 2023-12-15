import org.junit.Test;
//1720
public class DecodeXORedArray {
    @Test
    public void test(){
        int[] encoded={1,2,3};
        int first=1;
        int[] arr=decode(encoded,first);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public int[] decode(int[] encoded, int first) {
        int size=encoded.length;
        int[] arr=new int[size+1];
        int temp=first;
        for(int i=0;i<arr.length-1;i++){
            arr[i]=temp;
            temp=encoded[i]^temp;
        }
        arr[size]=temp;
        return arr;
    }
}
