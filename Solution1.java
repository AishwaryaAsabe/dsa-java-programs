public class Solution1 {
    public static void sumFromBothEnds(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Sum elements at the left and right pointers
            int sum = arr[left] + arr[right];
            System.out.println("Sum of elements at index " + left + " and " + right + " is: " + sum);

            // Move the pointers towards each other
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        sumFromBothEnds(numbers);
        // Output:
        // Sum of elements at index 0 and 4 is: 6
        // Sum of elements at index 1 and 3 is: 6
        // Sum of elements at index 2 and 2 is: 3
    }
}
