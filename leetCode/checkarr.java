public class checkarr {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false; // More than one violation, not a rotated sorted array
            }
        }
        return true;
    }

    public static void main(String[] args) {
        checkarr sol = new checkarr();

        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(sol.check(nums1)); // true

        int[] nums2 = {2, 1, 3, 4};
        System.out.println(sol.check(nums2)); // false

        int[] nums3 = {1, 2, 3};
        System.out.println(sol.check(nums3)); // true

        int[] nums4 = {1, 1, 1, 1};
        System.out.println(sol.check(nums4)); // true

        int[] nums5 = {2, 3, 4, 5, 1};
        System.out.println(sol.check(nums5)); // true

        int[] nums6 = {10, 20, 30, 5, 6, 7};
        System.out.println(sol.check(nums6)); // false
    }
}
