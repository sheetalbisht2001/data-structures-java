//Right View of Binary Tree
//
//        Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.
//
//        Right view of following tree is 1 3 7 8.
//
//        1
//        /     \
//        2        3
//        /   \      /    \
//        4     5   6    7
//        \
//        8
//
//        Example 1:
//
//        Input:
//        1
//        /    \
//        3      2
//        Output: 1 2
//        Example 2:
//
//        Input:
//        10
//        /   \
//        20     30
//        /   \
//        40  60
//        Output: 10 30 60
//        Your Task:
//        Just complete the function rightView() that takes node as parameter and returns the right view as a list.
//
//        Expected Time Complexity: O(N).
//        Expected Auxiliary Space: O(Height of the Tree).
//
//        Constraints:
//        1 ≤ Number of nodes ≤ 105
//        0 ≤ Data of a node ≤ 105
//


        package RightViewOfBinaryTree;

class Solution{
        //Function to return list containing elements of right view of binary tree.
        ArrayList<Integer> rightView(Node node) {
                //add code here.

                ArrayList<Integer> list = new ArrayList<>();
                goDFS(node, 0, list);
                return list;
        }

        private void goDFS(Node node, int lvl, List<Integer> list) {
                if (node == null)
                        return;
                if (list.size() < lvl++ + 1){
                        list.add(node.data);
                }
                goDFS(node.right, lvl, list);
                goDFS(node.left, lvl, list);

        }
}


