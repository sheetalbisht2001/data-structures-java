//Given a string S, the task is to print all the duplicate characters with their occurrences in the given string.
//
//        Example:
//
//        Input: S = “geeksforgeeks”
//        Output:
//
//        e, count = 4
//        g, count = 2
//        k, count = 2
//        s, count = 2




        package PrintAllDuplicateCharactersinaString;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String s1=s.next() ;
        int[] count = new int[256] ;
        for(int i=0;i<s1.length;i++)
        {
            count[s1.charAt(i)] ++ ;
        }
        for(int i=0;i<256;i++)
        {
            if(count[i]>1)
            {
                System.out.println((char)(i)+" count = "+count[i]) ;
            }
        }
    }
}
