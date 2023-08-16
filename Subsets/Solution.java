// 78. Subsets

// Given an integer array nums of unique elements, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]
 

// Constraints:

// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10
// All the numbers of nums are unique.

package Subsets;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        // Base case
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        // EXCLUDE
        solve(nums, output, index + 1, ans);

        // INCLUDE
        int element = nums[index];
        output.add(element);
        solve(nums, output, index + 1, ans);

        // Backtrack - remove the last element to explore other possibilities
        output.remove(output.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();    //  all outputs store here.
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }
}

