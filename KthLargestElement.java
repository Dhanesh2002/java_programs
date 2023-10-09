import java.util.*;
public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        if (k < 1 || nums == null || nums.length < k) {
            System.out.println("the array is empty");
            System.exit(0);
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while (true) {
            int pivotIndex = partition(nums, left, right);
            
            if (pivotIndex == k - 1) {
                return nums[pivotIndex];
            } else if (pivotIndex > k - 1) {
                right = pivotIndex - 1;
            } else {
                left = pivotIndex + 1;
            }
        }
    }
    
    private static int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int i = left + 1;
        int j = right;
        
        while (i <= j) {
            if (nums[i] < pivot && nums[j] > pivot) {
                swap(nums, i, j);
                i++;
                j--;
            }
            
            if (nums[i] >= pivot) {
                i++;
            }
            
            if (nums[j] <= pivot) {
                j--;
            }
        }
        
        swap(nums, left, j);
        return j;
    }
    
    private static void swap(int[] nums, int i, int j) {
        
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 4, 2, 9, 6, 8, 5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
             arr[i] = sc.nextInt();
            }
        int kthLargest = findKthLargest(arr, k);
        System.out.println(kthLargest);
    }
}
