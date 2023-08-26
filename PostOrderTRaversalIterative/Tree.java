//Postorder Traversal (Iterative)
//
//        Given a binary tree. Find the postorder traversal of the tree without using recursion.
//
//        Example 1
//
//        Input:
//        1
//        /   \
//        2     3
//        /  \
//        4    5
//
//        Output: 4 5 2 3 1
//        Explanation:
//        Postorder traversal (Left->Right->Root) of
//        the tree is 4 5 2 3 1.
//        Example 2
//
//        Input:
//        8
//        /      \
//        1          5
//        \       /   \
//        7     10    6
//        \   /
//        10 6
//
//        Output: 10 7 1 6 10 6 5 8
//        Explanation:
//

        package PostOrderTRaversalIterative;

class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();

        Stack<Node> st1 = new Stack<>();

        Stack<Node> st2 = new Stack<>();

        st1.push(node);

        while(st1.size()>0){

            node = st1.pop();

            st2.push(node);

            if(node.left!=null){

                st1.add(node.left);

            }

            if(node.right!=null){

                st1.add(node.right);

            }

        }

        while(st2.size()>0){

            node= st2.pop();

            al.add(node.data);

        }

        return al;
    }
}
