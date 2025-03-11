import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        // fees -> 기본시간, 기본 요금, 단위 시간, 단위 요금
         int baseTime = fees[0],baseFee = fees[1], unitTime = fees[2], unitFee = fees[3];
        // 출차된 내역이 없다면 23:59분에 출차로 간주
        
        Map<Integer, Integer> totalTime = new HashMap<>(); // 누적 주차 시간
        Map<Integer, Integer> entryTime = new HashMap<>(); // 입차 시각
        
        //시각, 차량번호, 내역
        for(String record : records){
            String[] parts = record.split(" ");
            int time = timeToMinute(parts[0]); //시각을 분 단위로 전환
            int carNumber = Integer.parseInt(parts[1]);
            String type = parts[2];
            
            if(type.equals("IN")){
                entryTime.put(carNumber, time);
            } else{
                int parkedTime = time - entryTime.get(carNumber);
                totalTime.put(carNumber, totalTime.getOrDefault(carNumber,0)+parkedTime);
                entryTime.remove(carNumber);
            }
        }
        // 출차하지 않은 차량
        int endOfDay = timeToMinute("23:59");
        for(int car : entryTime.keySet()){
            int parkedTime = endOfDay - entryTime.get(car);
            totalTime.put(car, totalTime.getOrDefault(car, 0) + parkedTime);
        }
        //차량 번호 오름차순 정렬 후 요금 계산
        List<Integer> sortedCars = new ArrayList<>(totalTime.keySet());
        Collections.sort(sortedCars);

        int[] answer = new int[sortedCars.size()];
        for (int i = 0; i < sortedCars.size(); i++) {
            int totalTimes = totalTime.get(sortedCars.get(i));
            answer[i] = calculateFee(totalTimes, baseTime, baseFee, unitTime, unitFee);
        }
        return answer;
    }
    //시각 -> 분 단위 전환 메서드
    private int timeToMinute(String time){
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0])*60+Integer.parseInt(parts[1]);
    }
    // 요금 계산 메서드
    private int calculateFee(int totalTime, int baseTime, int baseFee, int unitTime, int unitFee){
        if (totalTime <= baseTime) return baseFee;
        return baseFee + (int) Math.ceil((double) (totalTime - baseTime) / unitTime) * unitFee;
    }
    
}