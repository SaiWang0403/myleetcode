import org.junit.Test;

public class RemoveDuplicatedFromSortedArray {
//快慢指针
//26 删除有序数组的重复项
    @Test
    public void test(){
        int[] arr ={1,1,2};
        int res=removeDuplicatedFromSortedArray(arr);
        System.out.println(res);
    }

    public int removeDuplicatedFromSortedArray(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int i=0;
        for (int j=1;j<arr.length;j++){
            //不想等的话让i也往后移， 然后在i后移的那个位置放入j的值
            //这样i每次碰到不一样的数的时候都会往后移，然后记录了j的值，所以j以后还碰到相等的值时 i就不往后移了，只有j自己往后移，重复的数就放在那不用管了
            if(arr[j]!= arr[i]){
                arr[++i]=arr[j];
            }
        }
        return i+1;
    }
}
