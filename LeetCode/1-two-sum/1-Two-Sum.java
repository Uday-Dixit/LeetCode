class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Har ek element ko uthao
        for (int i = 0; i < nums.length; i++) {
            // Aur uske aage wale saare elements se check karo
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Direct original indices mil gaye
                }
            }
        }
        return new int[]{0, 0};
    }
}