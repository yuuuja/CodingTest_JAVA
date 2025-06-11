import java.util.*;
class Solution {
    public String[] solution(String[][] plans) {
        
        LinkedList<Task> tasks = new LinkedList<>();
        for(String[] plan : plans){
            tasks.offer(new Task(plan[0], timeToMinute(plan[1]), Integer.parseInt(plan[2])));
        }
        tasks.sort((t1,t2)->t1.startTime - t2.startTime); // 시작 시각 순으로 정렬
        
        Stack<Task> stopTasks = new Stack<>();
        List<String> endTasks = new ArrayList<>();
        Task now = tasks.poll();
        int time = now.startTime;
        while(!tasks.isEmpty()){
            time += now.leftTime;
            Task next = tasks.peek();
            
            if(time > next.startTime){
                now.leftTime = time - next.startTime;
                stopTasks.push(now);
            } else{
                endTasks.add(now.name);
                if(!stopTasks.empty()){
                    now = stopTasks.pop();
                    continue;
                }
            }
            now = tasks.poll();
            time = now.startTime;
        }
        
        endTasks.add(now.name);
        while(!stopTasks.empty()){
            endTasks.add(stopTasks.pop().name);
        }
        
        return endTasks.toArray(new String[0]);
    }
    private int timeToMinute(String time){
        String[] t = time.split(":");
        return Integer.parseInt(t[0])*60+Integer.parseInt(t[1]);
    }
    class Task{
        String name;
        int startTime;
        int leftTime;
        Task(String name, int startTime, int leftTime){
            this.name = name;
            this.startTime = startTime;
            this.leftTime = leftTime;
        }
    }
}