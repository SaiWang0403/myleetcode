import org.junit.Test;
//704
public class BinarySearch {
//用最后一个 《=
    //Searcha2DMatrix
    //ValidPerfectSquare
    @Test
    public void test(){
        int arr[]={-1,0,3,5,9,12};
        int target=0;
//        int index=search(arr,0,arr.length-1,target);
        int res=search(arr,target);
//        System.out.println(index);
        System.out.println(res);

    }

//    public int search(int[] arr,int start,int end, int key){
//        int mid=(start+end)/2;
//        if(start<=end){
//            if(key>arr[mid]){
//                return  search(arr,mid+1,end,key);
//            }
//            else if(key<arr[mid]){
//                return search(arr,start,mid-1,key);
//            }
//            else {
//                return mid;
//            }
//
//        }
//        else {
//            return -1;
//        }
//
//    }


    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;

            }else if(target<nums[mid]){
                //不用mid-1 因为是left<right 如果减一可能出现left 和right相等， 所以要right=mid 让left移动过来
                right = mid;
            }else if(target>nums[mid]){
                left = mid+1;
            }
        }
        return -1;
    }
// -1,0,3,5,9,12

    public int search(int[] nums, int target) {

        int low=0,high=nums.length-1;


        while(low<=high)
        {
            int mid =(low+high)/2;
            if(nums[mid]==target)
                return mid;

            if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;

        }

        return -1;
    }
    }


