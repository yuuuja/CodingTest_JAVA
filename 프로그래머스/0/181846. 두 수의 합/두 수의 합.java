import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger num_a = new BigInteger(a);
        BigInteger num_b = new BigInteger(b);
        
        BigInteger sum = num_a.add(num_b);
        return sum.toString();
    }
}