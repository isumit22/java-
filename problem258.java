class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}

public class problem258 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.addDigits(957531);
        System.out.println("Result: " + result);
    }
}
