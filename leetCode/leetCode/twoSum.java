package leetCode;

import java.util.HashMap;

public class twoSum {
    public int[] TSum(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>(); 

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store the current number and its index
            map.put(nums[i], i);
        }

        // If no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        twoSum ts = new twoSum();
        
        // Use an array declaration to call the method
        int[] result = ts.TSum(new int[]{1, 2, 3, 4}, 4);

        // Print the result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
