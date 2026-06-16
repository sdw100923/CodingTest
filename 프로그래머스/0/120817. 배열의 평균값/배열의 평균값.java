class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int a = 0;
        double b = 0;
        while (a < numbers.length){
            b += numbers[a];
            a++;
        
        }
        answer = b / numbers.length;
        
        return answer;
        
    }
}