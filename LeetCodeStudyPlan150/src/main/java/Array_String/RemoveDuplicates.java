package Array_String;

// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr));
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
