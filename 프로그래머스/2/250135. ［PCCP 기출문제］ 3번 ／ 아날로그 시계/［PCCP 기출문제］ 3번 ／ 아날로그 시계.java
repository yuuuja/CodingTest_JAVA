import java.util.*;
class Solution {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        //(0시0분0초~끝나는 시간동안 마주친 횟수) - (0시0분0초~시작하는 시간동안 마주친 횟수)
        // 초침 60초, 분침 3600초, 시침 43200초
        // 분침 한바퀴에 59번, 시침 한바퀴에  719번 마주침
        int answer = -1;
        
        int startSec = parseToSec(h1, m1, s1);
        int endSec = parseToSec(h2, m2, s2);
        
        answer = countAlarms(endSec) - countAlarms(startSec);
        answer += alarmNow(startSec) ? 1:0;
        
        return answer;
    }
    private int parseToSec(int h, int m, int s){
        return h*60*60 + m*60 + s;
    }
    private int countAlarms(int seconds){
        int minuteAlarms = seconds * 59 / 3600;
        int hourAlarms = seconds * 719 / 43200;
        
        int duplicatedAlarms = 43200 <= seconds ? 2: 1; //분침과 시침이 겹치는 경우
        
        return minuteAlarms + hourAlarms - duplicatedAlarms;
    }
    private boolean alarmNow(int seconds){
        return seconds * 59 / 3600 == 0 || seconds * 719 % 43200 == 0;
    }
}