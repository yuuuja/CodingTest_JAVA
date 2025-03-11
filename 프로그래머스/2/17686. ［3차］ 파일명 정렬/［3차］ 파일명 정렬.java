import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (a, b) -> {
            String[] file1 = splitFile(a);
            String[] file2 = splitFile(b);

            // HEAD 비교 (대소문자 무시)
            int headCompare = file1[0].compareToIgnoreCase(file2[0]);
            if (headCompare != 0) return headCompare;

            // NUMBER 비교 (정수 변환 후 비교)
            int num1 = Integer.parseInt(file1[1]);
            int num2 = Integer.parseInt(file2[1]);
            return Integer.compare(num1, num2);
        });

        return files;
    }
    private String[] splitFile(String file) {
        StringBuilder head = new StringBuilder();
        StringBuilder number = new StringBuilder();
        String tail = "";
        int i = 0;

        // HEAD 추출 (처음 숫자가 나오기 전까지)
        while (i < file.length() && !Character.isDigit(file.charAt(i))) {
            head.append(file.charAt(i));
            i++;
        }
        // NUMBER 추출 (최대 5자리까지 숫자)
        while (i < file.length() && Character.isDigit(file.charAt(i))) {
            number.append(file.charAt(i));
            i++;
        }
        // TAIL 추출 (남은 부분)
        if (i < file.length()) {
            tail = file.substring(i);
        }

        return new String[]{head.toString(), number.toString(), tail};
    }

}