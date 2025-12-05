public class Solution {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int result = solution.sum(21, 48);
        System.out.println("The sum of 21 and 48 is: " + result); // Output: 69

    }

}