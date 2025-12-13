public class Solution {

    public int maximumWealth(int[][] accounts) {

        int maxWealthSoFar = 0;

        for (int[] customer : accounts) {

            int currentCustomerWealth = 0;

            for (int banks : customer) {
                currentCustomerWealth += banks;
            }

            maxWealthSoFar = Math.max(currentCustomerWealth, maxWealthSoFar);
        }
        return maxWealthSoFar;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[][] accounts = {
                { 7, 1, 3 },
                { 2, 8, 7 },
                { 1, 9, 5 }
        };
        int result = solution.maximumWealth(accounts);
        System.out.println("The richest customer's wealth is: " + result); // Output should be 17

    }

}
