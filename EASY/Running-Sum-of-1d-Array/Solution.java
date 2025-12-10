public class Solution {

    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = { 1, 2, 3, 4, 5 };

        int[] result = solution.runningSum(nums);

        String outputString = "";

        outputString += "[";
        for (int num : result) {
            outputString += num + ",";
        }
        outputString += "]";
        System.out.println(outputString.replace(",]", "]"));

    }

}