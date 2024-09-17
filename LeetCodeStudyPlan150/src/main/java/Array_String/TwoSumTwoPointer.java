package Array_String;

public class TwoSumTwoPointer {
    public static int[] twoSum(int[] arr, int target) {
        int[] output = new int[2];
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if(arr[i] + arr[j] == target) {
                output[0] = i+1; output[1] = j+1;
                return output;
            }
            if(arr[i] + arr[j] < target) {
                i++;
            }else{
                j--;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15}; int target = 9;
        int[] prem = twoSum(numbers, target);
        for (int j : prem) {
            System.out.print(j + " ");
        }
    }
}
