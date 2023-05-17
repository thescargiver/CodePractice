class Solution {
    static int isPossible(int n, int m, String s) {
        int curI, curJ;
        int l, r, u, d;
        l = r = u = d = curI = curJ = 0;
        for (char ch : s.toCharArray()) {
            switch(ch) {
                case 'L': curJ--; break;
                case 'R': curJ++; break;
                case 'U': curI--; break;
                case 'D': curI++; break;
                default: 
                    throw new IllegalArgumentException("Given string path is invalid found: " + s);
            }
            l = Math.min(l, curJ);
            r = Math.max(r, curJ);
            u = Math.min(u, curI);
            d = Math.max(d, curI);
        }

        return ((r - l) < m && (d - u) < n)? 1 : 0;
    }
}
