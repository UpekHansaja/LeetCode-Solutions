# Running Sum of 1D Array

Given an array `nums`, we define a running sum of an array as `runningSum[i] = sum(nums[0]…nums[i])`.

Return the running sum of `nums`.

## Example 1:

```plaintext
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows:
 - runningSum[0] = 1
 - runningSum[1] = 1 + 2 = 3
 - runningSum[2] = 1 + 2 + 3 = 6
 - runningSum[3] = 1 + 2 + 3 + 4 = 10

```

## Example 2:

```plaintext
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows:
 - runningSum[0] = 1
 - runningSum[1] = 1 + 1 = 2
 - runningSum[2] = 1 + 1 + 1 = 3    
 - runningSum[3] = 1 + 1 + 1 + 1 = 4
 - runningSum[4] = 1 + 1 + 1 + 1 + 1 = 5

```

## Constraints:

 - `1 <= nums.length <= 1000`
 - `-10^6 <= nums[i] <= 10^6`

