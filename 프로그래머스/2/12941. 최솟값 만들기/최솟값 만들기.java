import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A); 
        Arrays.sort(B); 
        for(int i=1;i<=A.length;i++){
            answer += A[i-1]*B[B.length-i];
        }

        return answer;
    }
}