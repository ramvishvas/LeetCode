// Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.

// For example, with A = "abcd" and B = "cdabcdab".

// Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").

// Note:
// The length of A and B will be between 1 and 10000. 


class Solution {
    public int repeatedStringMatch(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        int i = 0, j= 0, count = 0;
      
        while(i < lenA){
            if(i % lenA == 0){
                ++count;
            }
            if(A.charAt(i) != B.charAt(j)){
                 ++i;
            }
            else{
                break;
            }
           
        }
        while(j < lenB){
            if(A.charAt(i%lenA) == B.charAt(j)){
                if(i % lenA == 0 && i != 0){
                    ++count;
                }
                ++i;
                ++j;
            } 
            else{
                return -1;
            }
        }
        return count;
    }
}
