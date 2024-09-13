package Array_String;

// Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5, nums = [0,1,4,0,3,_,_,_]

public class RemoveElements {
    public static int removeGivenValue(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i]; index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2}; int val = 2;
        int out = removeGivenValue(arr, val);
        System.out.println(out);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
