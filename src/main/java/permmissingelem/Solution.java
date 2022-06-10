package permmissingelem;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A){
        int n = A.length+1;
        int sum = (n*(n+1))/2;
        int s = 0;
        if(A.length==1||A.length==0||A.length>100000){
            return 1;
        }
        for(int i =0;i<A.length;i++){
            s=s+A[i];
        }
        return  sum-s;
    }
}
