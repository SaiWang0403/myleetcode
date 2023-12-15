import org.junit.Test;

public class MajorityElement {
    //169
    @Test
    public void test(){
        int[] nums={2,2,1,1,1,2,2};
        int res=majorityElement(nums);
        System.out.println(res);
    }


    public int majorityElement(int[] arr) {
        int index_of_maj_ele=0;
        int count =1;
        for(int i =1;i<arr.length;i++){


            if(arr[i]==arr[index_of_maj_ele]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                index_of_maj_ele=i;
                count=1;
            }

        }
        return arr[index_of_maj_ele];
    }
}
