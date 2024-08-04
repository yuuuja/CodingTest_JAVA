class Solution {
    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if( n%i==0 || n%(i+2)==0 ) return false;
        }
        return true;
    }
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(isPrime(nums[i]+nums[j]+nums[k])){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}