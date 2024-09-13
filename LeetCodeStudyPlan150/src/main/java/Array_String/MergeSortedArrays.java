package Array_String;

public class MergeSortedArrays {
    public static int[] mergeArrays(int[] arr1, int n, int[] arr2, int m) {
        int n_ind = n - 1, m_ind = m - 1, right = n + m - 1;
        while(m_ind >= 0){
            if(n_ind >= 0 && arr1[n_ind] > arr2[m_ind]){
                arr1[right] = arr1[n_ind]; n_ind--;
            }else{
                arr1[right] = arr2[m_ind]; m_ind--;
            }
            right--;
        }
        return arr1;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        int[] out = mergeArrays(arr1, n, arr2, m);
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
