//Inorder Traversal (Iterative)
//
//        Given a binary tree. Find the inorder traversal of the tree without using recursion.
//
//        Example 1
//
//        Input:
//        1
//        /    \
//        2       3
//        /   \
//        4     5
//        Output: 4 2 5 1 3
//        Explanation:
//        Inorder traversal (Left->Root->Right) of
//        the tree is 4 2 5 1 3.
//        Example 2
//
//        Input:
//        8
//        /   \
//        1      5
//        \    /  \
//        7   10   6
//        \  /
//        10 6
//        Output: 1 7 10 8 6 10 5 6
//        Explanation:
//        Inorder traversal (Left->Root->Right)
//        of the tree is 1 7 10 8 6 10 5 6.
//
//
//        Your task:
//        You don't need to read input or print anything. Your task is to complete the function inOrder() which takes the root of the tree as input and returns a list containing the inorder traversal of the tree, calculated without using recursion.
//
//        Expected time complexity: O(N)
//        Expected auxiliary space: O(N)
//
//
//        Constraints:
//        1 <= Number of nodes <= 105
//        1 <= Data of a node <= 105


package InorderTraversalIterative;

class Solution
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        // Code
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        Node cur = root;
        while(!st.isEmpty() || cur!=null){
            if(cur!=null){
                st.push(cur);
                cur=cur.left;
            }
            else{
                cur = st.pop();
                al.add(cur.data);
                cur=cur.right;
            }
        }
        return al;
    }


}
