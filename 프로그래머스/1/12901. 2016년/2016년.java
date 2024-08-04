import java.util.HashMap;
class Solution {
    public String solution(int a, int b) {
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,31);
        map.put(2,29);
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);
        int sum = 0;
        for(int i=1;i<a;i++){
            sum+=map.get(i);
        }
        sum+=b;
        
        String answer = week[sum%7];
        return answer;
    }
}