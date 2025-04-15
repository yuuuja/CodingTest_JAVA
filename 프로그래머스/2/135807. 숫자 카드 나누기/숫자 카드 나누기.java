class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayA[0];
        int gcdB= arrayB[0];
        for(int i=1;i<arrayA.length;i++){
            gcdA = gcd(gcdA, arrayA[i]);
        }
        for(int i=1;i<arrayB.length;i++){
            gcdB = gcd(gcdB, arrayB[i]);
        }
        
        boolean validA = true;
        for (int b : arrayB) {
            if (b % gcdA == 0) {
                validA = false;
                break;
            }
        }
        boolean validB = true;
        for (int a : arrayA) {
            if (a % gcdB == 0) {
                validB = false;
                break;
            }
        }

        int answer = 0;
        if (validA) answer = Math.max(answer, gcdA);
        if (validB) answer = Math.max(answer, gcdB);

        return answer;
    }
    private int gcd(int a, int b) { //최대공약수
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}