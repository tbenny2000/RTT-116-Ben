package org.perscholas.LeetCode;

import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        // ===== TWO SUM =======
        // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        // You may assume that each input would have exactly one solution, and you may not use the same element twice.
        // You can return the answer in any order.
        // Example 1:
        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 15;
        int[] result = solution.twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        // Use a hash map to store numbers and their indices
        HashMap<Integer, Integer> map = new java.util.HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // The number we need to find

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target
                return new int[]{map.get(complement), i};
            }
            // Store the number and its index in the map
            map.put(nums[i], i);
        }
        // If no solution is found, return null
        return null;
    }
}
