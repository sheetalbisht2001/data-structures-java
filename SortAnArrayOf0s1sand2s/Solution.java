//Sort an array of 0s, 1s and 2s
//        Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
//
//
//        Example 1:
//
//        Input:
//        N = 5
//        arr[]= {0 2 1 2 0}
//        Output:
//        0 0 1 2 2
//        Explanation:
//        0s 1s and 2s are segregated
//        into ascending order.
//        Example 2:
//
//        Input:
//        N = 3
//        arr[] = {0 1 0}
//        Output:
//        0 0 1
//        Explanation:
//        0s 1s and 2s are segregated
//        into ascending order.
//
//        Your Task:
//        You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.
//
//
//        Expected Time Complexity: O(N)
//        Expected Auxiliary Space: O(1)
//
//
//        Constraints:
//        1 <= N <= 10^6
//        0 <= A[i] <= 2
//


        package SortAnArrayOf0s1sand2s;

//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int lo = 0;
        int hi = n - 1;
        int mid = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    int temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    int temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;


                }

            }
        }
    }
}
