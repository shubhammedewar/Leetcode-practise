import java.util.Vector;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        Vector<Integer> ans = new Vector<>();

        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            ans.add(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) {
            ans.add(carry);
        }

        int[] rev = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            rev[i] = ans.get(ans.size() - 1 - i);
        }

        return rev;
    }
}