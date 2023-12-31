//Height of Binary Tree
//
//        Given a binary tree, find its height.
//
//
//        Example 1:
//
//        Input:
//        1
//        /  \
//        2    3
//        Output: 2
//        Example 2:
//
//        Input:
//        2
//        \
//        1
//        /
//        3
//        Output: 3
//
//        Your Task:
//        You don't need to read input or print anything. Your task is to complete the function height() which takes root node of the tree as input parameter and returns an integer denoting the height of the tree. If the tree is empty, return 0.
//
//
//        Expected Time Complexity: O(N)
//        Expected Auxiliary Space: O(N)


//        Constraints:
//        1 <= Number of nodes <= 105
//        1 <= Data of a node <= 105




    package HeightOfBinaryTree;

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node)
    {
        // code here
        if (node == null) {
            return 0;
        }

        // Recursively calculate the height of the left and right subtrees.
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Return the maximum height of the left and right subtrees plus 1 (for the current node).
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

