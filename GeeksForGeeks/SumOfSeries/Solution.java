package GeeksForGeeks.SumOfSeries;

class Solution {
    public static long seriesSum(int n) {
        // code here
        // 1, 2, 3, 4 ... 
        // Sn = n/2 [2a + (n-1)d]
        // a = 1, d = 1
        return (long) n * (n + 1) / 2;
    }
}
