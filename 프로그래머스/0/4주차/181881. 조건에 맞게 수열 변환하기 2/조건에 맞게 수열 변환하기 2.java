class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean change; //변화 체크
        
        while(true){
            change = false; 
            int[] arr_x = new int[arr.length];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=50&&arr[i]%2==0){
                    arr_x[i]=arr[i]/2;
                }
                else if(arr[i]<50&&arr[i]%2==1){
                    arr_x[i]=arr[i]*2+1;
                }
                else{
                    arr_x[i]=arr[i];
                }
                if(arr_x[i]!=arr[i])
                    change=true;
            }
            if(!change){
                break;
            }
            arr=arr_x;
            answer++;
        }
        
        return answer;
    }
}
