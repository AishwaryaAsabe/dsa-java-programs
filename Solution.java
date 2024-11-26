import java.util.Arrays;
public class Solution {
    public static void reverseArray(int[] arr) {
        int left = 0;                   // Pointer starting from the left side
        int right = arr.length - 1;     // Pointer starting from the right side

        while (left < right) {
            // Swap the elements at the left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers)); // Output: [5, 4, 3, 2, 1]
    }
}
