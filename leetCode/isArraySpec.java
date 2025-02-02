import java.util.Scanner;

public class isArraySpec {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] % 2) == (nums[i - 1] % 2)) { // Same parity
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        // Taking input for array elements
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Creating an instance of Solution and testing the function
        isArraySpec solution = new isArraySpec();
        boolean result = solution.isArraySpecial(nums);

        // Printing the result
        System.out.println("Is the array special? " + result);

        scanner.close();
    }
}
