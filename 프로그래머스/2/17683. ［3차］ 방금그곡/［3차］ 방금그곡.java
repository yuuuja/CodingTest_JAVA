import java.util.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int maxLen = -1;
        
        m = replaceSharp(m);
        
        for (String info : musicinfos) {
            String[] parts = info.split(",");
            String title = parts[2];
            String melody = replaceSharp(parts[3]);
            int len = timeToMinute(parts[1])-timeToMinute(parts[0]);
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                sb.append(melody.charAt(i % melody.length()));
            }

            String played = sb.toString();
            if (played.contains(m) && len > maxLen) {
                maxLen = len;
                answer = title;
            }
        }
        
        return answer;
    }
    private Integer timeToMinute(String time){
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        return hour*60 + minute;
    }
    private String replaceSharp(String s) {
        return s.replace("C#", "c")
                .replace("D#", "d")
                .replace("F#", "f")
                .replace("G#", "g")
                .replace("A#", "a")
                .replace("B#", "b");
    }
}