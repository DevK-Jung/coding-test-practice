class Solution {
    public int solution(int a, int b) {
        int x = Integer.parseInt(String.valueOf(a) + b);
        int y = Integer.parseInt(String.valueOf(b) + a);

        return Math.max(x, y);
    }
}