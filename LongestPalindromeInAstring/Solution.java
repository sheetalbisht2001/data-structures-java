//Longest Palindrome in a String
//        Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string that reads the same backward. More formally, S is a palindrome if reverse(S) = S. In case of conflict, return the substring which occurs first ( with the least starting index).
//
//        Example 1:
//
//        Input:
//        S = "aaaabbaa"
//        Output: aabbaa
//        Explanation: The longest Palindromic
//        substring is "aabbaa".
//        Example 2:
//
//        Input:
//        S = "abc"
//        Output: a
//        Explanation: "a", "b" and "c" are the
//        longest palindromes with same length.
//        The result is the one with the least
//        starting index.
//        Your Task:
//        You don't need to read input or print anything. Your task is to complete the function longestPalin() which takes the string S as input and returns the longest palindromic substring of S.
//
//        Expected Time Complexity: O(|S|2).
//        Expected Auxiliary Space: O(1).
//
//        Constraints:
//        1 ≤ |S| ≤ 103

        package LongestPalindromeInAstring;

class Solution{
        static String longestPalin(String S){
                // code here
                int maxLength=-1;
                String longestMatch="";
                for(int i=0;i<S.length();i++){
                        int startIndex=i;
                        int endIndex=-1;
                        for(int j=S.length()-1;j>=startIndex;j--){
                                if(S.charAt(startIndex)==S.charAt(j)){
                                        if(endIndex==-1){
                                                endIndex=j;
                                        }
                                        startIndex++;
                                }else{
                                        if(endIndex!=-1){
                                                j=endIndex;
                                                endIndex=-1;
                                                if(startIndex!=i){
                                                        startIndex=i;
                                                }
                                        }
                                }
                        }
                        if(endIndex!=-1 && endIndex-i>maxLength){
                                maxLength=endIndex-i;
                                longestMatch=S.substring(i,endIndex+1);
                        }
                }
                return longestMatch;
        }
}

