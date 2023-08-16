// Remove duplicates from an unsorted linked list
// EasyAccuracy: 45.95%Submissions: 199K+Points: 2
// Done with this problem? Now use these skills to apply for a job in Job-A-Thon 21!

// Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes, the node which appeared first should be kept, all others duplicates are to be removed.

// Example 1:

// Input:
// N = 4
// value[] = {5,2,2,4}
// Output: 5 2 4
// Explanation:Given linked list elements are
// 5->2->2->4, in which 2 is repeated only.
// So, we will delete the extra repeated
// elements 2 from the linked list and the
// resultant linked list will contain 5->2->4


// Example 2:

// Input:
// N = 5
// value[] = {2,2,2,2,2}
// Output: 2
// Explanation:Given linked list elements are
// 2->2->2->2->2, in which 2 is repeated. So,
// we will delete the extra repeated elements
// 2 from the linked list and the resultant
// linked list will contain only 2.
// Your Task:
// You have to complete the method removeDuplicates() which takes 1 argument: the head of the linked list.  Your function should return a pointer to a linked list with no duplicate element.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

// Constraints:
// 1 <= size of linked lists <= 106
// 0 <= numbers in list <= 104



package RemoveDuplicatesFromAnUNsortedLInkedLIst;



/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;
        Node previous = null;
        Set<Integer> seenValues = new HashSet<>();

        while (current != null) {
            if (seenValues.contains(current.data)) {
                previous.next = current.next;
            } else {
                seenValues.add(current.data);
                previous = current;
            }
            current = current.next;
        }

        return head;
    }
}




