class Solution {
    public static int findMoves(int n, int[] chairs, int[] passengers) {
        int cnt = 0;
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        for (int i = 0; i < n; i++) {
            cnt += Math.abs(chairs[i] - passengers[i]);
        }
        return cnt;
    }
}

