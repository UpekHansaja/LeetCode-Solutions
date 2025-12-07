# Root Equals Sum of Children

You are given the `root` of a binary tree where each node contains a single digit (0-9). This binary tree only consists of exactly 3 nodes: the root, its left child, and its right child.

Return `true` if the value of the root node is equal to the sum of the values of its two children, or `false` otherwise.


## Example 1:

```plaintext

                    (10)
                   /    \
                  /      \
                (4)      (6)

```

```plaintext

Input: root = [10,4,6]
Output: true
Explanation: The root node's value is 10, and the sum of its left child and right child is 4 and 6 respectively. 10 is equal to 4 + 6, so we return true.

```

## Example 2:

```plaintext

                    (5)
                   /    \
                  /      \
                (3)      (1)

```

```plaintext

Input: root = [5,3,1]
Output: false
Explanation: The root node's value is 5, and the sum of its left child and right child is 3 and 1 respectively. 5 is not equal to 3 + 1, so we return false.

```

## Constraints:

 - The tree consists only of the root, its left child, and its right child.
 - Each node's value is a digit from 0 to 9.
 - The `TreeNode` class is done for you.